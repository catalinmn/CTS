package ro.ase.cts.builder.program;

import ro.ase.cts.builder.RezervareBuilder;
import ro.ase.cts.builderV2.RezervareBuilderV2;
import ro.ase.cts.commonBuilder.Rezervare;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		////////////////////////////////BUILDER///////////////////////////////////
		
		Rezervare r1 = new Rezervare(123, false, false, true, false, "Indie");
		Rezervare r2 = new RezervareBuilder().setCodRezervare(10).setAreScaunErgonomic(true).build();
		Rezervare r3 = new RezervareBuilder().setCodRezervare(15).setAreMancareInclusa(true).setAreMuzicaAmbientala(true).build();
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		
		Rezervare r4 = new RezervareBuilder(25).setAreMancareInclusa(true).setAreMuzicaAmbientala(true).build();
		System.out.println(r4);
		
		RezervareBuilderV2 rezervareBuilderV2 = new RezervareBuilderV2();
		rezervareBuilderV2.setAreScaunErgonomic(true).setAreBauturaInclusa(true).setAreMuzicaAmbientala(true);
		
		Rezervare r5 = rezervareBuilderV2.setCodRezervare(1).build();
		Rezervare r6 = rezervareBuilderV2.setCodRezervare(2).build();
		
		System.out.println(r5);
		System.out.println(r6);
		
	}

}
