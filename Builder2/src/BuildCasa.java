public class BuildCasa extends ACasa{

    Casa casa;

    public BuildCasa() {
        this.casa = new Casa(true, true, true);
    }

    @Override
    public ACasa addSink() {
        this.casa.hasSink = true;
        return this;
    }

    @Override
    public ACasa addWC() {
        this.casa.hasWC = true;
        return this;
    }

    @Override
    public ACasa addCamereVideo() {
        this.casa.hasCamereVideo = true;
        return this;
    }

    @Override
    public Casa build() {
        return this.casa;
    }
}
