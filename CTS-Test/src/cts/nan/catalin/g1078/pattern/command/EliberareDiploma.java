package cts.nan.catalin.g1078.pattern.command;

public class EliberareDiploma {
	
	private TipCerere tipCerere;
	private String denumire;
	
	public EliberareDiploma(TipCerere tipCerere, String denumire) {
		super();
		this.tipCerere = tipCerere;
		this.denumire = denumire;
	}

	public TipCerere getTipCerere() {
		return tipCerere;
	}

	public String getDenumire() {
		return denumire;
	}

	public void rezolvaCerere() {
		System.out.println( this.denumire + " cu priorite " + this.tipCerere + " este rezolvata");
	}
}
