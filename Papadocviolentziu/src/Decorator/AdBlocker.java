package Decorator;

public class AdBlocker extends ADecoratorTab{

    public AdBlocker(ITab itab) {
        super(itab);
    }

    @Override
    public void display() {
        System.out.println("Blocking ads...");
        ref.display();
    }
}
