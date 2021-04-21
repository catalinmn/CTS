package ro.ase.java.state_modifState;


public class Masa {
	private int cod;
	private State stare;
	
	public Masa(int cod) {
		super();
		this.cod = cod;
		this.stare = new StateLibera();
	}

	public State getStare() {
		return stare;
	}

	void setStare(State stare) { //daca il lasam default acest setter, va putea fi folosit DOAR IN ACELASI PACHET
		this.stare = stare;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}
	
	public void rezervaMasa() {
		StateRezervata stateRezervata = new StateRezervata();
		stateRezervata.modificaState(this);
	}
	
	public void ocupaMasa() {
		StateOcupata stateOcupata = new StateOcupata();
		stateOcupata.modificaState(this);
	}
	
	public void elibereazaMasa() {
		StateLibera stateLibera = new StateLibera();
		stateLibera.modificaState(this);
	}
	
	public void ridicaRezervare() {
		this.ocupaMasa();
	}
}
