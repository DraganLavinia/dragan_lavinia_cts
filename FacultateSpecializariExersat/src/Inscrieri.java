public class Inscrieri {
    private long cnp;
    private String nume;
    private double nota;
    private int specializare;

    public Inscrieri(String linie) {
        this.cnp = Long.parseLong(linie.split(",")[0]);
        this.nume = linie.split(",")[1];
        this.nota = Double.parseDouble(linie.split(",")[2]);
        this.specializare = Integer.parseInt(linie.split(",")[3]);
    }

    public Inscrieri(long cnp, String nume, double nota, int specializare) {
        this.cnp = cnp;
        this.nume = nume;
        this.nota = nota;
        this.specializare = specializare;
    }

    public long getCnp() {
        return cnp;
    }

    public void setCnp(long cnp) {
        this.cnp = cnp;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public int getSpecializare() {
        return specializare;
    }

    public void setSpecializare(int specializare) {
        this.specializare = specializare;
    }

    @Override
    public String toString() {
        return "Inscrieri{" +
                "cnp=" + cnp +
                ", nume='" + nume + '\'' +
                ", nota=" + nota +
                ", specializare=" + specializare +
                '}';
    }
}
