package ro.ase.cts.builder;

import ro.ase.cts.commonBuilder.Rezervare;
import ro.ase.cts.commonBuilder.RezervareBuilderAbstract;

public class RezervareBuilder implements RezervareBuilderAbstract{

	private Rezervare rezervare;
	
	public RezervareBuilder() {
		super();
		this.rezervare = new Rezervare(0, false, false, false, false, "");
		
	}
	
	public RezervareBuilder(int codRezervare) {
		super();
		this.rezervare = new Rezervare(codRezervare, false, false, false, false, "");
	}
	
	
	@Override
	public Rezervare build() {
		// TODO Auto-generated method stub
		return this.rezervare;
	}
	
	public RezervareBuilder setCodRezervare(int codRezervare) {
		this.rezervare.setCodRezervare(codRezervare);
		return this;
	}

	public RezervareBuilder setAreMancareInclusa(boolean areMancareInclusa) {
		this.rezervare.setAreMancareInclusa(areMancareInclusa); 
		return this;
	}

	public RezervareBuilder setAreBauturaInclusa(boolean areBauturaInclusa) {
		this.rezervare.setAreBauturaInclusa(areBauturaInclusa);
		return this;
	}

	public RezervareBuilder setAreScaunErgonomic(boolean areScaunErgonomic) {
		this.rezervare.setAreScaunErgonomic(areScaunErgonomic); 
		return this;
	}

	public RezervareBuilder setAreMuzicaAmbientala(boolean areMuzicaAmbientala) {
		this.rezervare.setAreMuzicaAmbientala(areMuzicaAmbientala); 
		return this;
	}

	public RezervareBuilder setGenMuzica(String genMuzica) {
		this.rezervare.setGenMuzica(genMuzica); 
		return this;
	}


}
