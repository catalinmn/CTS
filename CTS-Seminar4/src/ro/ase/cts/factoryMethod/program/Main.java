package ro.ase.cts.factoryMethod.program;

import ro.ase.cts.factoryMethod.Factory;
import ro.ase.cts.factoryMethod.FactoryFundas;
import ro.ase.cts.factoryMethod.FactoryMijlocas;
import ro.ase.cts.factoryMethod.FactoryPortar;
import ro.ase.cts.factoryMethod.Jucator;

public class Main {
	
	private static void afiseazaJucator(Factory factory, String numeJucator) {
		Jucator jucator = factory.creeazaJucator(numeJucator);
		System.out.println(jucator.toString());
	}

	public static void main(String[] args) {
		
		afiseazaJucator(new FactoryPortar(), "Mihai");
		afiseazaJucator(new FactoryFundas(), "Daniel");
		afiseazaJucator(new FactoryMijlocas(), "Cineva");
	}

}
