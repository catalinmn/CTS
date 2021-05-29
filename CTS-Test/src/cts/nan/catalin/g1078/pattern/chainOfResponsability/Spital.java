package cts.nan.catalin.g1078.pattern.chainOfResponsability;

public class Spital extends Responsabil{

	public Spital(String numePersoana, int varsta, boolean esteConstient, boolean sePoateDeplasa,
			boolean areMembreRupte, boolean areRaniDeschise) {
		super(numePersoana, varsta, esteConstient, sePoateDeplasa, areMembreRupte, areRaniDeschise);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void trateaza() {

		System.out.println("Pacientul este tratat la spital");
		
	}

}
