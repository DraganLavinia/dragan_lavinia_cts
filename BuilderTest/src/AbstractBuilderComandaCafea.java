public abstract class AbstractBuilderComandaCafea {
    public abstract AbstractBuilderComandaCafea addLapte(String lapte);
    public  abstract AbstractBuilderComandaCafea addZahar(int nivelZahar);
    public abstract AbstractBuilderComandaCafea addGheata();
    public abstract AbstractBuilderComandaCafea addAroma(String aroma);
    public abstract AbstractBuilderComandaCafea addFrisca();

    public abstract ComandaCafea build();
}
