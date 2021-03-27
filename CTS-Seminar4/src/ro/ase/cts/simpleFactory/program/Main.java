package ro.ase.cts.simpleFactory.program;

import ro.ase.cts.simpleFactory.Factory;
import ro.ase.cts.simpleFactory.Jucator;
import ro.ase.cts.simpleFactory.TipJucator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factory factory = new Factory();
		
		Jucator portar = factory.getJucator(TipJucator.Portar, "Tatarusanu");
		Jucator fundas = factory.getJucator(TipJucator.Fundas, "Banica");
		
		System.out.println(portar.toString());
		System.out.println(fundas.toString());
	}

}
