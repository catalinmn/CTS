package ro.ase.cts.adapter.program;

import ro.ase.cts.adapter.AdapterClasa;
import ro.ase.cts.adapter.AdapterObiect;
import ro.ase.cts.adapter.Bilet;
import ro.ase.cts.adapter.BiletOnline;

public class Main {

	public static void rezervaSiVindeBiletLaCasa(Bilet bilet) {
		bilet.rezerva();
		bilet.vinde();
	}
	
	public static void rezervaSiVindeBiletOnline(BiletOnline biletOnline) {
		biletOnline.rezervaBiletOnline();
		biletOnline.vindeBiletOnline();
	}
	
	public static void main(String[] args) {
	
		Bilet bilet = new Bilet(20);
		rezervaSiVindeBiletLaCasa(bilet);
		
		AdapterClasa biletClasaAdapter = new AdapterClasa(10);
		rezervaSiVindeBiletOnline(biletClasaAdapter);
		
		BiletOnline biletObiectAdapter = new AdapterObiect(bilet);
		rezervaSiVindeBiletOnline(biletObiectAdapter);
	}

}
