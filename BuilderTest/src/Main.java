//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ComandaCafea cafea1 = new BuilderComandaCafea("Latte",15,"large").build();

        System.out.println(cafea1);

        ComandaCafea cafea2 = new BuilderComandaCafea("Cappucino",20,"medie")
                .addAroma("caramel")
                .addFrisca().build();
        System.out.println(cafea2);
    }
}