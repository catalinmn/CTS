package ro.ase.cts.prototype.program;

import ro.ase.cts.prototype.Bilet;
import ro.ase.cts.prototype.Client;
import ro.ase.cts.prototype.Copiator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client client1 = new Client("Marcel", 23);
		Client client2 = (Client) client1.copiaza();
		Copiator client3 = client1.copiaza();
		
		System.out.println(client1);
		System.out.println(client2);
		System.out.println(client3);
		
		Bilet bilet1 = new Bilet(23, "e1", "e2", "12:00");
		
		Bilet bilet2 = (Bilet) bilet1.copiaza();
		bilet2.setCod(2);
		
		Copiator bilet3 = (Bilet) bilet1.copiaza();
		//bilet3.setCod(2); => daca initializam cu copiator nu mai avem acces la setteri si getteri
	}

}
