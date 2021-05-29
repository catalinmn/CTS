package cts.nan.catalin.g1078.pattern.chainOfResponsability;

public class Medic extends Responsabil{

	public Medic(String numePersoana, int varsta, boolean esteConstient, boolean sePoateDeplasa, boolean areMembreRupte,
			boolean areRaniDeschise) {
		super(numePersoana, varsta, esteConstient, sePoateDeplasa, areMembreRupte, areRaniDeschise);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void trateaza() {

		if(!super.areMembreRupte && !super.areRaniDeschise) {
			System.out.println("Pacientul este inconstient, dar nu are nimic grav, va fi tratat de medic");
			return;
		}
		else {
			System.out.println("Pacientul se afla intr-o stare grava, va fi tratat la spital");
			super.setUrmatorulResponsabil(new Spital(numePersoana, varsta, esteConstient, sePoateDeplasa, areMembreRupte, areRaniDeschise));
			super.getUrmatorulResponsabil().trateaza();;
		}
		
	}

}
