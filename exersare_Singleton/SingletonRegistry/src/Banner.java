import java.util.HashMap;
import java.util.Map;

public class Banner implements ProdusMarketing{

    private static final Map<String, Banner> bannere = new HashMap<>();
    private String numeClient;
    private String domeniu;
    private int latime;
    private int inaltime;

    private Banner(String numeClient, String domeniu, int latime, int inaltime) {
        this.numeClient = numeClient;
        this.domeniu = domeniu;
        this.latime = latime;
        this.inaltime = inaltime;
    }

    public static Banner getBanner(String numeClient, String domeniu, int latime, int inaltime){
        if(!bannere.containsKey(domeniu)){
            bannere.put(domeniu,new Banner(numeClient,domeniu,latime,inaltime));
        }
        return bannere.get(domeniu);
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
        return "Banner pentru clientul " + numeClient + ", domeniu: " + domeniu;
    }
}
