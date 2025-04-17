
public class MainSingleton {
    public static void main(String[] args) {
        Banner b1 = Banner.getBanner("gigel.sa","it",30,35);
        Banner b2 = Banner.getBanner("gicutsa.sa","crosetat",50,35);
        Banner b3 = Banner.getBanner("ionik.srl","it",60,40);

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

        System.out.println(b1==b3);//se verifica daca au aceeasi instanta
    }
}