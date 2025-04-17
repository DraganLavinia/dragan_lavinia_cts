public class Casa {

   boolean acoperis;
   boolean pereti;
   boolean podea;

   boolean hasSink;
   boolean hasWC;
   boolean hasCamereVideo;

    public Casa(boolean acoperis, boolean pereti, boolean podea) {
        this.acoperis = acoperis;
        this.pereti = pereti;
        this.podea = podea;
    }

    @Override
    public String toString() {
        return "Casa{" +
                "acoperis=" + acoperis +
                ", pereti=" + pereti +
                ", podea=" + podea +
                ", hasSink=" + hasSink +
                ", hasWC=" + hasWC +
                ", hasCamereVideo=" + hasCamereVideo +
                '}';
    }
}
