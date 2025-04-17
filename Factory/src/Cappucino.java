public class Cappucino extends TipCafea{
    public Cappucino(float pret, String marime) {
        super(pret, marime);
    }

    @Override
    public void comanda() {
        System.out.println("s-a comandat un cappucino la pretul de " + getPret() + " RON si marimea " + getMarime());
    }
}
