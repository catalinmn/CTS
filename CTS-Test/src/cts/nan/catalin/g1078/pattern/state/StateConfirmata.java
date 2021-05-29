package cts.nan.catalin.g1078.pattern.state;

import java.util.concurrent.ThreadLocalRandom;

public class StateConfirmata implements State{

	@Override
	public void modificaStare(CerereStudent cerere) {
		
		if(cerere.getStare() instanceof StateTrimisaPeFlux) {
			System.out.println("Cererea studentului " + cerere.getNumeStudent() +" este confirmata");
			
			int randomNum = ThreadLocalRandom.current().nextInt(1, 10 + 1);
			cerere.setTermen(randomNum);
			
			cerere.setStare(new StateConfirmata());
			
			cerere.verificare();
		}

	}

}
