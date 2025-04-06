package Prototype;

public class SistemOperare implements Cloneable{

    private final String nume;
    private final String versiune;

    public SistemOperare(String nume, String versiune) {
        this.nume = nume;
        this.versiune = versiune;
    }

    public SistemOperare clone(){
        try{
            return (SistemOperare) super.clone();
        }catch (CloneNotSupportedException ce){
            throw new IllegalArgumentException(ce);
        }
    }

    public void print(){
        System.out.println("sistemul de operare " + nume + " cu versiunea " + versiune);
    }


}
