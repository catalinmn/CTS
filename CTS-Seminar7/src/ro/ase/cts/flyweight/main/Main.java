package ro.ase.cts.flyweight.main;

import ro.ase.cts.flyweight.Client;
import ro.ase.cts.flyweight.FlyweightFactory;
import ro.ase.cts.flyweight.Rezervare;

public class Main {

	public static void main(String[] args) {
		Rezervare rezervare1 =  new Rezervare(1, 2, "12");
		Rezervare rezervare2 =  new Rezervare(2, 2, "13");
		Rezervare rezervare3 =  new Rezervare(3, 5, "14");
		
		FlyweightFactory flyweightFactory = new FlyweightFactory();
		Client client1 = flyweightFactory.getClient("1234");
		client1.printeazaRezervare(rezervare1);
		
		flyweightFactory.getClient("1234").printeazaRezervare(rezervare2);
		flyweightFactory.getClient("1234").printeazaRezervare(rezervare3);
		
		Client client2 = flyweightFactory.getClient("5678");
		client2.printeazaRezervare(rezervare1);
	}

}
