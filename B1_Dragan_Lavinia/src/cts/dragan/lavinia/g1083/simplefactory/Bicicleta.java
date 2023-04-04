package cts.dragan.lavinia.g1083.simplefactory;

public class Bicicleta {
	private String corpBicicleta;
	private String ghidon;
	private String sa;
	private String pedale;
	private String roti;
	
	private TipBicicleta tip;
	
	private float diametru;
	private String tipFrana;
	private boolean areCasca;
	private boolean areOchelari;
	
	public Bicicleta(String corpBicicleta,String ghidon,String sa, String pedale,String roti, TipBicicleta tip) {
		this.corpBicicleta = corpBicicleta;
		this.ghidon = ghidon;
		this.sa = sa;
		this.pedale = pedale;
		this.roti = roti;
		this.tip = tip;
	}
	
	public String getCorpBicicleta() {
		return corpBicicleta;
	}

	public void setCorpBicicleta(String corpBicicleta) {
		this.corpBicicleta = corpBicicleta;
	}

	public String getGhidon() {
		return ghidon;
	}

	public void setGhidon(String ghidon) {
		this.ghidon = ghidon;
	}

	public String getSa() {
		return sa;
	}

	public void setSa(String sa) {
		this.sa = sa;
	}

	public String getPedale() {
		return pedale;
	}

	public void setPedale(String pedale) {
		this.pedale = pedale;
	}

	public String getRoti() {
		return roti;
	}

	public void setRoti(String roti) {
		this.roti = roti;
	}

	public float getDiametru() {
		return diametru;
	}

	public void setDiametru(float diametru) {
		this.diametru = diametru;
	}

	public String getTipFrana() {
		return tipFrana;
	}

	public void setTipFrana(String tipFrana) {
		this.tipFrana = tipFrana;
	}

	public boolean isAreCasca() {
		return areCasca;
	}

	public void setAreCasca(boolean areCasca) {
		this.areCasca = areCasca;
	}

	public boolean isAreOchelari() {
		return areOchelari;
	}

	public void setAreOchelari(boolean areOchelari) {
		this.areOchelari = areOchelari;
	}
	
	public String toString() {
		return "Bicicleta de tipul " + tip + " are corpul " + corpBicicleta + " cu ghidonul " + ghidon + " saua "
				+ sa + " pedalele " + pedale + " si rotile " + roti + 
				" cu diamentrul de " + diametru + "cm impreuna cu franele. " 
				+ tipFrana + " Are casca: " + areCasca + " si are ochelarii: "
				+ areOchelari;
	}
	
}
