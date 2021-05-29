package cts.nan.catalin.g1078.pattern.chainOfResponsability;

public class AsistentMedical extends Responsabil{

	public AsistentMedical(String numePersoana, int varsta, boolean esteConstient, boolean sePoateDeplasa,
			boolean areMembreRupte, boolean areRaniDeschise) {
		super(numePersoana, varsta, esteConstient, sePoateDeplasa, areMembreRupte, areRaniDeschise);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void trateaza() {

		if(super.esteConstient && !super.sePoateDeplasa) {
			System.out.println("Doar nu se poate deplasa, va fi tratat de asistent medical");
			return;
		}
		else if(!super.esteConstient) {
			System.out.println("Este inconstient, trebuie chemat un medic");
			super.setUrmatorulResponsabil(new Medic(numePersoana, varsta, esteConstient, sePoateDeplasa, areMembreRupte, areRaniDeschise));
			super.getUrmatorulResponsabil().trateaza();
			
		}
		
	}

}
