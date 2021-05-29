package cts.nan.catalin.g1078.pattern.chainOfResponsability;

public abstract class Responsabil extends FisaAccident{
	
	private Responsabil urmatorulResponsabil;
	
	String numePersoana;
    int varsta;
    boolean esteConstient;
    boolean sePoateDeplasa;
    boolean areMembreRupte;
    boolean areRaniDeschise;
    
	public Responsabil(String numePersoana, int varsta, boolean esteConstient, boolean sePoateDeplasa, boolean areMembreRupte,
			boolean areRaniDeschise) {
		super();
		
		this.urmatorulResponsabil =null;
		
		this.numePersoana = numePersoana;
		this.varsta = varsta;
		this.esteConstient = esteConstient;
		this.sePoateDeplasa = sePoateDeplasa;
		this.areMembreRupte = areMembreRupte;
		this.areRaniDeschise = areRaniDeschise;
	}
    
	public Responsabil getUrmatorulResponsabil() {
		return urmatorulResponsabil;
	}

	public void setUrmatorulResponsabil(Responsabil urmatorulResponsabil) {
		this.urmatorulResponsabil = urmatorulResponsabil;
	}

	public abstract void trateaza();

}
