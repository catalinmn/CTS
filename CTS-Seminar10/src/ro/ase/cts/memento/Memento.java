package ro.ase.cts.memento;

public class Memento {
	
	///aici vor fi atributele pe care vrem sa le salvam
	
	private String echipaGazda;
	private String echipaOaspeti;
	private int nrSpectatori;
	
	public Memento(String echipaGazda, String echipaOaspeti, int nrSpectatori) {
		super();
		this.echipaGazda = echipaGazda;
		this.echipaOaspeti = echipaOaspeti;
		this.nrSpectatori = nrSpectatori;
	}
	
	public String getEchipaGazda() {
		return echipaGazda;
	}
	
	public String getEchipaOaspeti() {
		return echipaOaspeti;
	}
	
	public int getNrSpectatori() {
		return nrSpectatori;
	}
	
	
}
