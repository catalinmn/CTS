package ro.ase.java.state_modifState.main;

import ro.ase.java.state_modifState.Masa;
import ro.ase.java.state_modifState.StateLibera;


public class Main {

	public static void main(String[] args) {
		
		Masa masa = new Masa(10);
		
		masa.elibereazaMasa();
		masa.rezervaMasa();
		masa.ocupaMasa();
		masa.rezervaMasa();
		masa.elibereazaMasa();
		masa.ridicaRezervare();

//		masa.setStare(new StateLibera()); // setterul va fi default ca sa nu putem face asta
//		masa.rezervaMasa();
	}

}
