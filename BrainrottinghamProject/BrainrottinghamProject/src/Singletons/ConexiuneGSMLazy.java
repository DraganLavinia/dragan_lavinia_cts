package Singletons;
//punctul 2 - Singleton Lazy - nu vrem sa folosim prea multe resurse

public class ConexiuneGSMLazy implements IGSMInterface {

    private static ConexiuneGSMLazy instance = null;

    private ConexiuneGSMLazy() {System.out.println("s-a creat instanta");}

    public static ConexiuneGSMLazy getInstance(){
        if(instance == null){
            instance = new ConexiuneGSMLazy();
        }
        return instance;
    }


}
