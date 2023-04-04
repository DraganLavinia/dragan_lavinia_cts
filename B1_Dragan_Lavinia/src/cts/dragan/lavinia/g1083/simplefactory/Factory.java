package cts.dragan.lavinia.g1083.simplefactory;

public class Factory implements IBicicleta {
	
	Bicicleta b;
	
	public Factory(String corpBicicleta,String ghidon,String sa, String pedale,String roti, TipBicicleta tip) {
		b = new Bicicleta(corpBicicleta, ghidon, sa, pedale, roti, tip);
	}
	
	@Override
	public void setDiametruRoti(float diametru) {
		b.setDiametru(diametru);
	}

	@Override
	public void setTipFrana(String tipFrana) {
		b.setTipFrana(tipFrana);
	}

	@Override
	public void setCascaProtectie(boolean areCasca) {
		b.setAreCasca(areCasca);		
	}

	@Override
	public void setOchelari(boolean areOchelari) {
		b.setAreOchelari(areOchelari);
	}

	@Override
	public void afiseazaBicicleta() {
		System.out.println(b);
	}

	@Override
	public void afiseazaModDeUtilizare() {
		if(b.getRoti() == "subtiri") {
			System.out.println(" Modul de utilizare este sportiv!");
		}
		else {
			System.out.println(" Modul de utilizare este plimbare!");
		}
		
	}

		
}
