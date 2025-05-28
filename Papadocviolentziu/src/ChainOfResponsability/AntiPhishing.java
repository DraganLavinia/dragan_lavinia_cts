package ChainOfResponsability;

public class AntiPhishing extends AbstractURLHandler{
    @Override
    public void process(String url) {
        if(url.contains("phish")){
            System.out.println("Blocare url suspect de phish " + url);
            return;
        }
        if(next != null) next.process(url);
    }
}
