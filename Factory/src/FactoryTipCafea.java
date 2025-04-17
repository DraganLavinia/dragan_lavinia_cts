public class FactoryTipCafea {
    public TipCafea createTIpCafea(TipCafeaEnum tipCafea, float pret, String marime) throws Exception{
        switch (tipCafea){
            case latte:
                Latte latte = new Latte(pret,marime);
                return latte;
            case espresso:
                Espresso espresso = new Espresso(pret,marime);
                return espresso;
            case cappucino:
                Cappucino cappucino = new Cappucino(pret, marime);
                return cappucino;
            default:
                throw new Exception("tipul nu este returnat");

        }
    }
}
