package ro.ase.cts.flyweight;

public class Rezervare {
	
	private int nrMasa;
	private int nrPersoane;
	private String oraRezervare;
	
	public Rezervare(int nrMasa, int nrPersoane, String oraRezervare) {
		super();
		this.nrMasa = nrMasa;
		this.nrPersoane = nrPersoane;
		this.oraRezervare = oraRezervare;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Rezervare [nrMasa=");
		builder.append(nrMasa);
		builder.append(", nrPersoane=");
		builder.append(nrPersoane);
		builder.append(", oraRezervare=");
		builder.append(oraRezervare);
		builder.append("]");
		return builder.toString();
	}
	
	
}
