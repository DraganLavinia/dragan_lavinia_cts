public class BuilderComandaCafea extends AbstractBuilderComandaCafea{

    ComandaCafea comandaCafea;

    public BuilderComandaCafea(String tipCafea, float pret, String marime) {
        this.comandaCafea = new ComandaCafea(tipCafea,pret,marime);
    }

    @Override
    public AbstractBuilderComandaCafea addLapte(String lapte) {
        this.comandaCafea.tipLapte = lapte;
        return this;
    }

    @Override
    public AbstractBuilderComandaCafea addZahar(int nivelZahar) {
        this.comandaCafea.nivelZahar = nivelZahar;
        return this;
    }

    @Override
    public AbstractBuilderComandaCafea addGheata() {
        this.comandaCafea.areGheata = true;
        return this;
    }

    @Override
    public AbstractBuilderComandaCafea addAroma(String aroma) {
       this.comandaCafea.aroma = aroma;
       return this;
    }

    @Override
    public AbstractBuilderComandaCafea addFrisca() {
        this.comandaCafea.areFrisca = true;
        return this;
    }

    @Override
    public ComandaCafea build() {
        return this.comandaCafea;
    }
}
