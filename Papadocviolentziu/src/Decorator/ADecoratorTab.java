package Decorator;

public abstract class ADecoratorTab implements ITab{

    protected ITab ref;

    public ADecoratorTab(ITab itab){
        this.ref = itab;
    }
}
