package ro.ase.cts.chainOfResponsability;

public abstract class Cont {
	
	private Cont urmatorulCont;
	private int sold;
	private String iban;
	
	public Cont(int sold, String iban) {
		super();
		this.sold = sold;
		this.iban = iban;
		this.urmatorulCont = null;// by default oricum e null 
	}

	public Cont getUrmatorulCont() {
		return urmatorulCont;
	}

	public int getSold() {
		return sold;
	}

	public void setUrmatorulCont(Cont urmatorulCont) {
		this.urmatorulCont = urmatorulCont;
	}

	public void setSold(int sold) {
		this.sold = sold;
	}
	
	public abstract void plateste(int suma);
	
}
