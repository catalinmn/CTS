package ro.ase.java.state_modifContext;

public class Masa {

	private int cod;
	private State stare;
	
	public Masa(int cod) {
		super();
		this.cod = cod;
		this.stare = new StateLibera();
	}
	
	public void rezervaMasa() {
		
		if(this.stare instanceof StateLibera) {
			System.out.println("Masa cu codul " + this.cod +" este rezevata");
			this.stare = new StateRezervata();
		}
		else {
			System.out.println("Masa cu codul " + this.cod +" nu poate fi rezevata");
		}
	}
	
	public void ocupaMasa() {
		if(this.stare instanceof StateRezervata) {
			System.out.println("Masa cu codul " + this.cod +" este acum ocupata");
			this.stare = new StateOcupata();
		}
		else {
			System.out.println("Masa cu codul " + this.cod +" nu poate fi ocupta, trebuiue mat intai rezervata");
		}
	}
	
	
	public void elibereazaMasa() {
		if(!(this.stare instanceof StateLibera)) {
			System.out.println("Masa cu codul " + this.cod +" este acum eliberata");
			this.stare = new StateLibera();
		}
		else {
			System.out.println("Masa cu codul " + this.cod +" este deja eliberata");
		}
	}
	
	
	
	public void ocupaMasaFaraRezervare() {
		if(this.stare instanceof StateLibera) {
			System.out.println("Masa cu codul " + this.cod +" este acum ocupata");
			this.stare = new StateOcupata();
		}
		else {
			System.out.println("Masa cu codul " + this.cod +" nu poate fi ocupata");
		}
	}
}
