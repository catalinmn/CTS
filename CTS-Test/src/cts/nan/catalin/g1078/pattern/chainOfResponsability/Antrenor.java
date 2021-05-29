package cts.nan.catalin.g1078.pattern.chainOfResponsability;

public class Antrenor extends Responsabil{

	public Antrenor(String numePersoana, int varsta, boolean esteConstient, boolean sePoateDeplasa,
			boolean areMembreRupte, boolean areRaniDeschise) {
		super(numePersoana, varsta, esteConstient, sePoateDeplasa, areMembreRupte, areRaniDeschise);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void trateaza() {

		if(super.esteConstient && super.sePoateDeplasa) {
			System.out.println("Nu are rani grave, trebuie sa se odihneasca");
			return;
		}
		else if(!super.esteConstient || !super.sePoateDeplasa ) {
			System.out.println("Este accidentat, se va chema asistenul medical");
			
			super.setUrmatorulResponsabil(new AsistentMedical(numePersoana, varsta, esteConstient, sePoateDeplasa, areMembreRupte, areRaniDeschise));
			super.getUrmatorulResponsabil().trateaza();
			
		}
		
	}
}
