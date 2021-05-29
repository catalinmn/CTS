package cts.nan.catalin.g1078.pattern.command;

import java.util.ArrayList;
import java.util.List;

public class ComandaEliberareDiploma implements IProcesatorCerere{
	
	private EliberareDiploma diploma;
	
	public ComandaEliberareDiploma(EliberareDiploma diploma) {
		super();
		this.diploma = diploma;
	}

	@Override
	public void procesareCerere(TipCerere tip, String denumire) {
		
		diploma.rezolvaCerere();
		
	}

	public EliberareDiploma getDiploma() {
		return diploma;
	}

}
