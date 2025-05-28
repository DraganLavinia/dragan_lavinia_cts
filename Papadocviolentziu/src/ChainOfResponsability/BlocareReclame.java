package ChainOfResponsability;

public class BlocareReclame extends AbstractURLHandler{
    @Override
    public void process(String url) {
        System.out.println("Verificare reclame pentru " + url);
        if(next!=null){
            next.process(url);
        }
    }
}
