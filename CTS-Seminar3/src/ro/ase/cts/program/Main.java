package ro.ase.cts.program;

import ro.ase.cts.singleton.eager.ReceptieHotel;

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
		
	}

}
