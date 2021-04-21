package ro.ase.java.state_modifContext.main;

import ro.ase.java.state_modifContext.Masa;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Masa masa = new Masa(10);
		
		masa.elibereazaMasa();
		masa.rezervaMasa();
		masa.rezervaMasa();
		masa.ocupaMasa();
		masa.elibereazaMasa();
	}

}
