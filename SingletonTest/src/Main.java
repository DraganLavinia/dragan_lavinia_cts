//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SoundManagerRegistry instanta = SoundManagerRegistry.getInstance("muzica");

        SoundManagerRegistry instanta2 = instanta.clone();
        System.out.println(instanta);
        instanta2.setType("notificari");

        System.out.println(instanta2);

    }
}