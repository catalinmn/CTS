package ro.ase.cts.program;

import ro.ase.cts.singleton.eager.ReceptieHotel;
import ro.ase.cts.singleton.lazy.Cont;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReceptieHotel receptie1 = ReceptieHotel.getInstanta();
		ReceptieHotel receptie2 = ReceptieHotel.getInstanta();

		System.out.println(receptie1.toString());
		System.out.println(receptie2.toString());
		
		receptie1.setNumeHotel("Hotel1");
		receptie2.setEtaj(2);
		
		System.out.println(receptie1.toString());
		System.out.println(receptie2.toString());
		
		Cont cont1 = Cont.getInstantaCont("Catalin", "RON", 100);
		Cont cont2 = Cont.getInstantaCont("Andrei", "EUR", 10);
		
		System.out.println(cont1.toString());
		System.out.println(cont2.toString());
		
	}

}
