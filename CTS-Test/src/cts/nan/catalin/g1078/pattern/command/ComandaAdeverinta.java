package cts.nan.catalin.g1078.pattern.command;

import java.util.ArrayList;
import java.util.List;

public class ComandaAdeverinta implements IProcesatorCerere{
	
	private Adeverinta adeverinta;
	
	public ComandaAdeverinta(Adeverinta adeverinta) {
		super();
		this.adeverinta = adeverinta;
	}

	@Override
	public void procesareCerere(TipCerere tip, String denumire) {
		
		adeverinta.rezolvaCerere();
		
	}

	public Adeverinta getAdeverinta() {
		return adeverinta;
	}
}
