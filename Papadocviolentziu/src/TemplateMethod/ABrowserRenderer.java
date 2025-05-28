package TemplateMethod;

public abstract class ABrowserRenderer {
    public final void renderPage(){
        initializeEngine();
        loadHTML_CSS_JS();
        loadEmojis();
        showProgressBar();
        renderFinalPage();
    }

    protected abstract void initializeEngine();
    protected abstract void loadHTML_CSS_JS();
    protected abstract void loadEmojis();
    protected abstract void showProgressBar();
    protected abstract void renderFinalPage();

}
