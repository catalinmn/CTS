package ro.ase.cts.memento;

public class MeciJucat {
	
	private String echipaGazda;
	private String echipaOaspeti;
	private int nrBileteVandute;
	private int nrSpectatori;
	private int nrStewarzi;
	
	public MeciJucat(String echipaGazda, String echipaOaspeti, int nrBileteVandute, int nrSpectatori, int nrStewarzi) {
		super();
		this.echipaGazda = echipaGazda;
		this.echipaOaspeti = echipaOaspeti;
		this.nrBileteVandute = nrBileteVandute;
		this.nrSpectatori = nrSpectatori;
		this.nrStewarzi = nrStewarzi;
	}

	public void setEchipaGazda(String echipaGazda) {
		this.echipaGazda = echipaGazda;
	}

	public void setEchipaOaspeti(String echipaOaspeti) {
		this.echipaOaspeti = echipaOaspeti;
	}

	public void setNrBileteVandute(int nrBileteVandute) {
		this.nrBileteVandute = nrBileteVandute;
	}

	public void setNrSpectatori(int nrSpectatori) {
		this.nrSpectatori = nrSpectatori;
	}

	public void setNrStewarzi(int nrStewarzi) {
		this.nrStewarzi = nrStewarzi;
	}

	public Memento creareMemento() {
		return new Memento(this.echipaGazda, this.echipaOaspeti, this.nrSpectatori);
	}
	
	public void setMemento(Memento memento) {
		this.echipaGazda = memento.getEchipaGazda();
		this.echipaOaspeti = memento.getEchipaOaspeti();
		this.nrSpectatori = memento.getNrSpectatori();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MeciJucat [echipaGazda=");
		builder.append(echipaGazda);
		builder.append(", echipaOaspeti=");
		builder.append(echipaOaspeti);
		builder.append(", nrBileteVandute=");
		builder.append(nrBileteVandute);
		builder.append(", nrSpectatori=");
		builder.append(nrSpectatori);
		builder.append(", nrStewarzi=");
		builder.append(nrStewarzi);
		builder.append("]");
		return builder.toString();
	}
	
	
}
