package Decorator;

public class Tab implements ITab{

    private String title;

    public Tab(String title) {
        this.title = title;
    }

    @Override
    public void display() {
        System.out.println("Tab-ul cu titlul " + this.title);
    }
}
