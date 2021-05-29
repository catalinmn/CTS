package cts.nan.catalin.g1078.pattern.state;

import java.util.concurrent.ThreadLocalRandom;

public class StateVerificata implements State{

	@Override
	public void modificaStare(CerereStudent cerere) {
		if(cerere.getStare() instanceof StateConfirmata) {
			String motiv = cerere.getMotiv();
			if(motiv.isEmpty()) {
				System.out.println("Cererea studentului " + cerere.getNumeStudent() +" nu are motiv, acum este respinsa");
				
				cerere.respingere();
				
				return;
			}
				
			System.out.println("Cererea studentului " + cerere.getNumeStudent() +" este verificata");
			
			
			int randomNum = ThreadLocalRandom.current().nextInt(1, 10 + 1);
			cerere.setTermen(randomNum);
			
			cerere.setStare(new StateVerificata());
			
			cerere.avizareDecanat();
		}
		else {
			System.out.println("Cererea studentului " + cerere.getNumeStudent() +" nu este inca confirmata");
		}
		
	}

}
