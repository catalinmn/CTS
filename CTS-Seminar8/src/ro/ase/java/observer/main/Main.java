package ro.ase.java.observer.main;

import ro.ase.java.observer.ClientFidel;
import ro.ase.java.observer.Restaurant;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Restaurant restaurant =  new Restaurant ("res", "Buc");
		ClientFidel client1 = new ClientFidel("A");
		ClientFidel client2 = new ClientFidel("B");
		ClientFidel client3 = new ClientFidel("C");
		
		restaurant.adaugaObserver(client1);
		restaurant.adaugaObserver(client2);
		
		restaurant.realizeazaOfertaPret();
		
		restaurant.stergeObserver(client1);
		restaurant.adaugaObserver(client3);
		
		restaurant.introducereMeniu();
		
	}

}
