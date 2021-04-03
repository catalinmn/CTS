package ro.ase.cts.builderV2;

import ro.ase.cts.commonBuilder.Rezervare;
import ro.ase.cts.commonBuilder.RezervareBuilderAbstract;

public class RezervareBuilderV2 implements RezervareBuilderAbstract{
	
	private int codRezervare;
	private boolean areMancareInclusa;
	private boolean areBauturaInclusa;
	private boolean areScaunErgonomic;
	private boolean areMuzicaAmbientala;
	private String genMuzica;
	
	
	
	public RezervareBuilderV2() {
		super();
		this.codRezervare = 0;
		this.areMancareInclusa = false;
		this.areBauturaInclusa = false;
		this.areScaunErgonomic = false;
		this.areMuzicaAmbientala = false;
		this.genMuzica = "";
	}

	public RezervareBuilderV2 setCodRezervare(int codRezervare) {
		this.codRezervare = codRezervare;
		return this;
	}

	public RezervareBuilderV2 setAreMancareInclusa(boolean areMancareInclusa) {
		this.areMancareInclusa = areMancareInclusa;
		return this;
	}

	public RezervareBuilderV2 setAreBauturaInclusa(boolean areBauturaInclusa) {
		this.areBauturaInclusa = areBauturaInclusa;
		return this;
	}

	public RezervareBuilderV2 setAreScaunErgonomic(boolean areScaunErgonomic) {
		this.areScaunErgonomic = areScaunErgonomic;
		return this;
	}

	public RezervareBuilderV2 setAreMuzicaAmbientala(boolean areMuzicaAmbientala) {
		this.areMuzicaAmbientala = areMuzicaAmbientala;
		return this;
	}

	public RezervareBuilderV2 setGenMuzica(String genMuzica) {
		this.genMuzica = genMuzica;
		return this;
	}


	@Override
	public Rezervare build() {
		// TODO Auto-generated method stub
		return new Rezervare(codRezervare, areMancareInclusa, areBauturaInclusa, areScaunErgonomic, areMuzicaAmbientala, genMuzica);
	}
	
	
}
