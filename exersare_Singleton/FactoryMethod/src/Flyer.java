public class Flyer implements ProdusMarketing{

    private String numeClient;
    private String domeniu;
    private int latime;
    private int inaltime;

    public Flyer(String numeClient, String domeniu, int latime, int inaltime) {
        this.numeClient = numeClient;
        this.domeniu = domeniu;
        this.latime = latime;
        this.inaltime = inaltime;
    }

    @Override
    public String getNumeClient() {
        return "";
    }

    @Override
    public String getDomeniuActivitate() {
        return "";
    }

    @Override
    public int getLatime() {
        return 0;
    }

    @Override
    public int getInaltime() {
        return 0;
    }

    @Override
    public String toString() {
        return "Flyer pentru clientul " + numeClient + ", domeniu: " + domeniu;
    }
}
