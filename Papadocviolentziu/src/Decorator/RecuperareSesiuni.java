package Decorator;

public class RecuperareSesiuni extends ADecoratorTab{
    public RecuperareSesiuni(ITab itab) {
        super(itab);
    }

    @Override
    public void display() {
        System.out.println("Recuperare sesiuni...");
        ref.display();
    }
}
