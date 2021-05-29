package cts.nan.catalin.g1078.main;

import cts.nan.catalin.g1078.pattern.command.Adeverinta;
import cts.nan.catalin.g1078.pattern.command.ComandaAdeverinta;
import cts.nan.catalin.g1078.pattern.command.ComandaEliberareDiploma;
import cts.nan.catalin.g1078.pattern.command.EliberareDiploma;
import cts.nan.catalin.g1078.pattern.command.ManagerCereri;
import cts.nan.catalin.g1078.pattern.command.TipCerere;

public class MainCommand {

public static void main(String[] args) throws Exception {
		
		
		ManagerCereri manager = new ManagerCereri();
		
		Adeverinta adeverinta1 = new Adeverinta(TipCerere.NORMALA, "adeverinta1");
		Adeverinta adeverinta2 = new Adeverinta(TipCerere.URGENTA, "adeverinta2");
		
		EliberareDiploma eliberareDiploma1 = new EliberareDiploma(TipCerere.URGENTA, "eliberareDiploma1");
		EliberareDiploma eliberareDiploma2 = new EliberareDiploma(TipCerere.NORMALA, "eliberareDiploma2");
		
		manager.executaCereri("toate");
		
		manager.executaCereri("adeverinta");
		manager.executaCereri("diploma");
		
		manager.invocaCerereAdeverinta(new ComandaAdeverinta(adeverinta1));
		manager.invocaCerereAdeverinta(new ComandaAdeverinta(adeverinta2));
		
		manager.invocaCerereDiploma(new ComandaEliberareDiploma(eliberareDiploma1));
		manager.invocaCerereDiploma(new ComandaEliberareDiploma(eliberareDiploma2));
		
		manager.executaCereri("adeverinta");
		manager.executaCereri("diploma");
		
		manager.invocaCerereAdeverinta(new ComandaAdeverinta(adeverinta1));
		manager.invocaCerereAdeverinta(new ComandaAdeverinta(adeverinta2));
		manager.invocaCerereDiploma(new ComandaEliberareDiploma(eliberareDiploma1));
		manager.invocaCerereDiploma(new ComandaEliberareDiploma(eliberareDiploma2));
		manager.executaCereri("toate");
	}
}
