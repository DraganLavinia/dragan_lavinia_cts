import org.json.JSONArray;
import org.json.JSONObject;

import java.io.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class Main {

    //FUNCTII
    private static List<Specializare> getSpecializare(){
       List<Specializare> specializari = new ArrayList<>();
       try(Connection conn = DriverManager.getConnection("jdbc:sqlite:Date/facultate.db")){
           Statement statement = conn.createStatement();
           statement.execute("SELECT * FROM SPECIALIZARI");

           ResultSet rs = statement.getResultSet();
           while(rs.next()){
           specializari.add(new Specializare(rs.getInt(1), rs.getString(2),rs.getInt(3)));
           }
       }catch (Exception ex){
           ex.printStackTrace();
       }
       return specializari;
    }
    private static List<Inscrieri> getInscrieri(){
       List<Inscrieri> inscrieri = new ArrayList<>();
       try(var fisier = new BufferedReader(new InputStreamReader(new FileInputStream("Date/inscrieri.txt")))){
           inscrieri = fisier.lines().map(Inscrieri::new).collect(Collectors.toList());
       }catch (FileNotFoundException ex){
           ex.printStackTrace();
       }catch (IOException ex){
           ex.printStackTrace();
       }
       return inscrieri;
    }
    //MAIN
    public static void main(String[] args) {
        List<Specializare> specializari = getSpecializare();
        List<Inscrieri> inscrieri = getInscrieri();
        System.out.println("continut baza de date: \n" + specializari);
        //cerinta 1
        int numarLocuriFAC = 0;
        for (Specializare s : specializari) {
            numarLocuriFAC += s.getLocuri();
        }
        System.out.println("Numarul de locuri disponibile la facultate este: " + numarLocuriFAC);

        //cerinta 2
        int nrlocOcupate = 0;
        int nrlocRamase = 0;
        Map<String,Integer> specializariLibere = new HashMap<>();
        for(Specializare s:specializari){
           nrlocRamase = s.getLocuri();
           for(Inscrieri i:inscrieri){
               if(s.getCod() == i.getSpecializare()){
                   nrlocRamase--;
               }
           }
               specializariLibere.put(s.getDenumire(),nrlocRamase);
        }
        specializariLibere.forEach((denumire, locuri) -> {
            if(locuri >= 10) {
                System.out.println("Specializare: " + denumire + ", Locuri libere: " + locuri);
            }
        });

        //cerinta 3
        try(var fisier = new PrintWriter("Date/jsonfile.json")){
            Map<Integer,Integer> numarInscrieri = new HashMap<>();
            Map<Integer,Double> medie = new HashMap<>();
            JSONArray arraySpecializari = new JSONArray();
            for(Specializare s:specializari) {
                numarInscrieri.put(s.getCod(), s.getLocuri() - specializariLibere.get(s.getDenumire()));
                double med = 0.0;
                int count = 0;
                for (Inscrieri i : inscrieri) {
                    if (s.getCod() == i.getSpecializare()) {
                        med += i.getNota();
                        count++;
                    }
                    medie.put(s.getCod(), med / (double) count);
                }
                    JSONObject obj = new JSONObject();

                    obj.put("cod specializare", s.getCod());
                    obj.put("denumire", s.getDenumire());
                    obj.put("numar inscrieri", numarInscrieri.get(s.getCod()));
                    obj.put("medie", medie.get(s.getCod()));

                    arraySpecializari.put(obj);
            }
            fisier.write(arraySpecializari.toString(4));
        }catch (FileNotFoundException ex){
            ex.printStackTrace();
        }
        System.out.println("!!!!fisiser json creat cu succesuri");

    }
}