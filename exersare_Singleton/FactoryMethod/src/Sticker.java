public class Sticker implements ProdusMarketing{

    private String numeClient;
    private String domeniu;
    private int latime;
    private int inaltime;

    public Sticker(String numeClient) {
        this.numeClient = numeClient;
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
        return "Sticker pentru clientul " + numeClient + ", domeniu: " + domeniu;
    }
}
