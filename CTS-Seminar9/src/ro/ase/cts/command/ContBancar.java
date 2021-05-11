package ro.ase.cts.command;

public class ContBancar {
	
	private String iban;
	private double sold;
	
	public ContBancar(String iban, double sold) {
		super();
		this.iban = iban;
		this.sold = sold;
	}
	
	public void constituire(double suma) {
		this.sold = suma;
		System.out.println("Contul are soldul: " + this.sold);
	}
	
	public void retragere(double suma) {
		if(sold >= suma) {
			this.sold -= suma;
			System.out.println("S-a restras suma: " + suma);
		}
		else {
			System.out.println("Fonduri insuficiente");
		}
	}
	
	public void depunere(double suma) {
		this.sold += suma;
		System.out.println("A fost depusa suma de " + suma);
	}
	
}
