package ro.ase.cts.facade.program;

import ro.ase.cts.facade.BirouDeCredite;
import ro.ase.cts.facade.Facade;
import ro.ase.cts.facade.Persoana;
import ro.ase.cts.facade.Politie;

public class Main {

	public static void main(String[] args) {
		
		Persoana persoana = new Persoana("G", "1234567891235");
//		if(persoana.getVarsta() > 18) {
//			if(!Politie.esteUrmarit(persoana)) {
//				BirouDeCredite birouCredite = new BirouDeCredite();
//				if(!birouCredite.areCredite(persoana)) {
//					System.out.println("Persoana este eligibila pentru credit");
//				}
//				else
//					System.out.println("Persoana are alte credite");
//			}
//			else
//				System.out.println("Persoana este urmarita de politie");
//		}
		
		//partea de mai sus a fost mutata in facade
		
		Facade.verificaPersoana(persoana);
	}

}
