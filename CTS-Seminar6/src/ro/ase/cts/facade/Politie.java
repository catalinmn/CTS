package ro.ase.cts.facade;

public class Politie {
	
	public static boolean esteUrmarit (Persoana persoana) { // cu static am facut functie in loc de metodata, insa puteam face la el ca in clasa BirouDeCredite
		return Integer.parseInt("" + persoana.getCnp().charAt(12)) % 2 == 0 ;
	}
	
}
