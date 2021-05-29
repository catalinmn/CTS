package cts.nan.catalin.g1078.pattern.state;

public class StateAvizareDecanat implements State{

	@Override
	public void modificaStare(CerereStudent cerere) {
		if(cerere.getStare() instanceof StateVerificata) {
			System.out.println("Cererea studentului " + cerere.getNumeStudent() +" este in curs de avizare la decanat");
		}
		else {
			System.out.println("Cererea studentului " + cerere.getNumeStudent() +" nu este inca verificata");
		}
		
	}

}
