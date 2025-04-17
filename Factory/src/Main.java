//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        FactoryTipCafea factoryTipCafea = new FactoryTipCafea();

        try{
            TipCafea latte = factoryTipCafea.createTIpCafea(TipCafeaEnum.latte,25,"GRANDE");
            latte.comanda();
            TipCafea cappucino = factoryTipCafea.createTIpCafea(TipCafeaEnum.cappucino,15,"MEDIUM");
            cappucino.comanda();
        }catch (Exception ex){
            throw new RuntimeException(ex);
        }

    }
}