package ro.ase.cts.chainOfResponsability.program;

import ro.ase.cts.chainOfResponsability.Cont;
import ro.ase.cts.chainOfResponsability.ContCredit;
import ro.ase.cts.chainOfResponsability.ContCurent;
import ro.ase.cts.chainOfResponsability.ContEconomii;

public class Main {

	public static void main(String[] args) {
		
		Cont c1 = new ContCurent(10, "ibanC1");
		Cont c2 = new ContEconomii(100, "ibanC2");
		Cont c3 = new ContCredit(1000, "ibanC3");
		
		c1.setUrmatorulCont(c2);
		c2.setUrmatorulCont(c3);
		
		c1.plateste(100);
		c1.plateste(200);
		c1.plateste(2000);

	}

}
