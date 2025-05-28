package TemplateMethod;

public class NormalModeRenderer extends ABrowserRenderer{
    @Override
    protected void initializeEngine() {
        System.out.println("initializare motor");
    }

    @Override
    protected void loadHTML_CSS_JS() {
        System.out.println("incarcare html css js");
    }

    @Override
    protected void loadEmojis() {
        System.out.println("incarcare emoji");
    }

    @Override
    protected void showProgressBar() {
        System.out.println("afiseaza bara progres");
    }

    @Override
    protected void renderFinalPage() {
        System.out.println("randare pagina");
    }
}
