public class FormeGeometrice implements Cloneable{
    private String forma;
    private String culoare;

    public FormeGeometrice(String forma, String culoare) {
        this.forma = forma;
        this.culoare = culoare;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    @Override
    public String toString() {
        return "FormeGeometrice{" +
                "forma='" + forma + '\'' +
                ", culoare='" + culoare + '\'' +
                '}';
    }


    public FormeGeometrice clone(){
        FormeGeometrice fg = new FormeGeometrice(this.forma,this.culoare);
        return fg;
    }
}
