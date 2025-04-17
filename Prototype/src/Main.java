import java.util.FormatterClosedException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        FormeGeometrice p1 = new Patrat("patrat","albastru");
        FormeGeometrice p2 = p1.clone();

        FormeGeometrice c1 = new FormeGeometrice("cerc","rosu");

        System.out.println(p1);
        p2.setCuloare("roz");
        //p2.setForma("CERC");
        System.out.println(p2);

        System.out.println(c1);
    }
}