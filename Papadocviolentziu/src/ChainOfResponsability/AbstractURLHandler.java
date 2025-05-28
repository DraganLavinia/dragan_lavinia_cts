package ChainOfResponsability;

public abstract class AbstractURLHandler {
    protected AbstractURLHandler next;

    public void setNext(AbstractURLHandler next) {
        this.next = next;
    }

    public abstract void process(String url);
}
