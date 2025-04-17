//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MainFactory {
    public static void main(String[] args) {
        ProdusMarketing p1 = ProdusMarketingFactory.createProdus("poster","gicu.srl","IT",50,50);
        ProdusMarketing p2 = ProdusMarketingFactory.createProdus("flyer","gicutza.srl","crosetat",60,50);
        //ProdusMarketing p3 = ProdusMarketingFactory.createProdus("cacareaza","gicutza.srl","crosetat",60,50);

        System.out.println(p1);
        System.out.println(p2);
        //System.out.println(p3);
    }
}