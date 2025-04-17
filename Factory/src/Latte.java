public class Latte extends TipCafea{
    public Latte(float pret, String marime) {
        super(pret, marime);
    }

    @Override
    public void comanda() {
        System.out.println("s-a comandat un latte la pretul de " + getPret() + " RON si marimea " + getMarime());
    }
}
