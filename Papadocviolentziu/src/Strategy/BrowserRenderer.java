package Strategy;

public class BrowserRenderer {

    private IRendering strategy;

    public void setStrategy(IRendering strategy) {
        this.strategy = strategy;
    }

    public void renderPage(){
        if(strategy !=null){
            strategy.render();
        }else{
            System.out.println("Nicio strategie de randare selectata");
        }
    }
}
