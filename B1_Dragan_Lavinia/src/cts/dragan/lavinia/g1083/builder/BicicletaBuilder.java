package cts.dragan.lavinia.g1083.builder;

public class BicicletaBuilder implements IBicicleta {

	Bicicleta bicicleta;
	
	public BicicletaBuilder(String corpBicicleta, String ghidon, String sa, String pedale, String roti) {
		bicicleta = new Bicicleta(corpBicicleta, ghidon, sa, pedale, roti);
	}
	
	@Override
	public void setDiametruRoti(float diametru) {
		bicicleta.setDiametru(diametru);
	}

	@Override
	public void setTipFrana(String tipFrana) {
		bicicleta.setTipFrana(tipFrana);
	}

	@Override
	public void setCascaProtectie(boolean areCasca) {
		bicicleta.setAreCasca(areCasca);		
	}

	@Override
	public void setOchelari(boolean areOchelari) {
		bicicleta.setAreOchelari(areOchelari);
	}

	@Override
	public void afiseazaBicicleta() {
		System.out.println(bicicleta);
		
	}

	@Override
	public void afiseazaModDeUtilizare() {
		if(bicicleta.getRoti() == "subtiri") {
			System.out.println(" Modul de utilizare este sportiv!");
		}
		else {
			System.out.println(" Modul de utilizare este plimbare!");
		}
	}

}
