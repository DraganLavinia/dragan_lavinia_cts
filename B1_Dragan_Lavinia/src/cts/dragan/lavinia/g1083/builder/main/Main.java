package cts.dragan.lavinia.g1083.builder.main;

import cts.dragan.lavinia.g1083.builder.Bicicleta;
import cts.dragan.lavinia.g1083.builder.BicicletaBuilder;

public class Main {

	public static void main(String[] args) {
		
		BicicletaBuilder b1 = new BicicletaBuilder("corpul1", "ghidon1", "sa1", "pedale1","subtiri");
		BicicletaBuilder b2 = new BicicletaBuilder("corpul2", "ghidon2", "sa2", "pedale2","subtiri");
		BicicletaBuilder b3 = new BicicletaBuilder("corpul3", "ghidon3", "sa3", "pedale3","groase");
		BicicletaBuilder b4 = new BicicletaBuilder("corpul4", "ghidon4", "sa4", "pedale4","groase");
		
		b1.afiseazaModDeUtilizare();
		b4.afiseazaModDeUtilizare();

	}

}
