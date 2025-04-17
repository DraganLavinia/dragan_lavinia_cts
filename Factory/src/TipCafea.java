public abstract class TipCafea {

    private float pret;
    private String marime;

    public TipCafea(float pret, String marime) {
        this.pret = pret;
        this.marime = marime;
    }

    @Override
    public String toString() {
        return "TipCafea{" +
                "pret=" + pret +
                ", marime='" + marime + '\'' +
                '}';
    }

    public float getPret() {
        return pret;
    }

    public String getMarime() {
        return marime;
    }

    public abstract void comanda();

}
