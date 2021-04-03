package ro.ase.cts.adapter;

public class Bilet {
	
	private int pret;

	public Bilet(int pret) {
		super();
		this.pret = pret;
	}
	
	public void vinde() {
		System.out.println("S-a vandut biletul al pretul de " + this.pret);
	}
	
	public void rezerva() {
		System.out.println("S-a rezervat biletul al pretul de " + this.pret);
	}

}
