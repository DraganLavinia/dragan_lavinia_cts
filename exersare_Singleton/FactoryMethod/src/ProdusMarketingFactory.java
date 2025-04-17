public class ProdusMarketingFactory {
    public static ProdusMarketing createProdus(String tip, String numeClient, String domeniu, int latime, int inaltime){
        switch (tip.toLowerCase()){
            case "poster":
                return new Poster(numeClient,domeniu,latime,inaltime);
            case "flyer":
                return new Poster(numeClient,domeniu,latime,inaltime);
            case "sticker":
                return new Poster(numeClient,domeniu,latime,inaltime);

            default:
                throw new RuntimeException("tip produs necunoscut: " + tip);

        }
    }
}
