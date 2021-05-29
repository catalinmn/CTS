package cts.nan.catalin.g1078.pattern.state;

import java.util.concurrent.ThreadLocalRandom;

public class StateTrimisaPeFlux implements State{

	@Override
	public void modificaStare(CerereStudent cerere) {
		System.out.println("Cererea studentului " + cerere.getNumeStudent() +" este trimisa pe flux");
		
		int randomNum = ThreadLocalRandom.current().nextInt(1, 10 + 1);
		cerere.setTermen(randomNum);
		
		cerere.confirmare();
		
	}

}
