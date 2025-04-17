public class Poster implements ProdusMarketing{

    private String numeClient;
    private String domeniu;
    private int latime;
    private int inaltime;

    public Poster(String numeClient, String domeniu, int latime, int inaltime) {
        this.numeClient = numeClient;
        this.domeniu = domeniu;
        this.latime = latime;
        this.inaltime = inaltime;
    }

    @Override
    public String getNumeClient() {
        return numeClient;
    }

    @Override
    public String getDomeniuActivitate() {
        return domeniu;
    }

    @Override
    public int getLatime() {
        return latime;
    }

    @Override
    public int getInaltime() {
        return inaltime;
    }

    @Override
    public String toString() {
        return "Poster pentru clientul " + numeClient + ", domeniu: " + domeniu;
    }
}
