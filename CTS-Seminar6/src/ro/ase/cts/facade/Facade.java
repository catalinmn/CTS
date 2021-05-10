package ro.ase.cts.facade;

public class Facade {
	
	public static void verificaPersoana(Persoana persoana) {
		if(persoana.getVarsta() > 18) {
			if(!Politie.esteUrmarit(persoana)) {
				BirouDeCredite birouCredite = new BirouDeCredite();
				if(!birouCredite.areCredite(persoana)) {
					System.out.println("Persoana este eligibila pentru credit");
				}
				else
					System.out.println("Persoana are alte credite");
			}
			else
				System.out.println("Persoana este urmarita de politie");
		}
	}
}
