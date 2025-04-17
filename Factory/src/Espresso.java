public class Espresso extends TipCafea{

    public Espresso(float pret, String marime) {
        super(pret, marime);
    }

    @Override
    public void comanda() {
        System.out.println("s-a comandat un espresso");
    }
}
