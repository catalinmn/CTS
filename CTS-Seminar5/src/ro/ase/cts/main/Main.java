package ro.ase.cts.main;

import ro.ase.cts.builder.RezervareBuilder;
import ro.ase.cts.common.Rezervare;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rezervare r1 = new Rezervare(123, false, false, true, false, "Indie");
		Rezervare r2 = new RezervareBuilder().setCodRezervare(10).setAreScaunErgonomic(true).build();
		Rezervare r3 = new RezervareBuilder().setCodRezervare(15).setAreMancareInclusa(true).setAreMuzicaAmbientala(true).build();
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		
		Rezervare r4 = new RezervareBuilder(25).setAreMancareInclusa(true).setAreMuzicaAmbientala(true).build();
	}

}
