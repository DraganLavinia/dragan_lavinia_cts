package ChainOfResponsability;

public class RecuperareSesiune extends AbstractURLHandler{
    @Override
    public void process(String url) {
        System.out.println("Recuperam sesiunea pentru " + url);
        if (next != null)
        {
            next.process(url);
        }
    }
}
