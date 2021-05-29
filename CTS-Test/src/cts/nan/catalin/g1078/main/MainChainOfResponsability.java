package cts.nan.catalin.g1078.main;

import cts.nan.catalin.g1078.pattern.chainOfResponsability.Antrenor;
import cts.nan.catalin.g1078.pattern.chainOfResponsability.AsistentMedical;
import cts.nan.catalin.g1078.pattern.chainOfResponsability.Medic;
import cts.nan.catalin.g1078.pattern.chainOfResponsability.Responsabil;
import cts.nan.catalin.g1078.pattern.chainOfResponsability.Spital;

public class MainChainOfResponsability {

	public static void main(String[] args) {
		
		Responsabil r1 = new Antrenor("ion", 20, false, true, true, false);
		
		Responsabil r2 = new AsistentMedical("ion", 20, false, true, true, false);
		Responsabil r3 = new Medic("ion", 20, false, true, true, false);
		Responsabil r4 = new Spital("ion", 20, false, true, true, false);
//		
//		r1.setUrmatorulResponsabil(r2);
//		r2.setUrmatorulResponsabil(r3);
//		r3.setUrmatorulResponsabil(r4);
//		
		r1.trateaza();

	}

}
