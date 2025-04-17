public class ComandaCafea {
    String tipCafea; //Latte, Cappucino
    float pret;
    String dimensiune; //mica, medie, mare
    //optionale:
    String tipLapte;
    int nivelZahar;
    boolean areGheata;
    String aroma;
    boolean areFrisca;


    public ComandaCafea(String tipCafea, float pret, String dimensiune) {
        this.tipCafea = tipCafea;
        this.pret = pret;
        this.dimensiune = dimensiune;
    }

    @Override
    public String toString() {
        return "ComandaCafea{" +
                "tipCafea='" + tipCafea + '\'' +
                ", pret=" + pret +
                ", dimensiune='" + dimensiune + '\'' +
                ", tipLapte='" + tipLapte + '\'' +
                ", nivelZahar=" + nivelZahar +
                ", areGheata=" + areGheata +
                ", aroma='" + aroma + '\'' +
                ", areFrisca=" + areFrisca +
                '}';
    }
}
