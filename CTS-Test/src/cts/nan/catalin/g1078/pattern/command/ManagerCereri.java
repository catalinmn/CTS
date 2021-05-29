package cts.nan.catalin.g1078.pattern.command;

import java.util.ArrayList;
import java.util.List;

public class ManagerCereri {

	List<IProcesatorCerere> listaComenziNormale;
	List<IProcesatorCerere> listaComenziUrgente;

	public ManagerCereri() {
		super();
		this.listaComenziNormale = new ArrayList<IProcesatorCerere>();
		this.listaComenziUrgente = new ArrayList<IProcesatorCerere>();
	}
	
	public void invocaCerereDiploma(ComandaEliberareDiploma diploma) {
		
		if(diploma.getDiploma().getTipCerere() == TipCerere.NORMALA)
			listaComenziNormale.add(diploma);
		else
			listaComenziUrgente.add(diploma);
	}
	
	public void invocaCerereAdeverinta(ComandaAdeverinta adeverinta) {
		
		if(adeverinta.getAdeverinta().getTipCerere() == TipCerere.NORMALA)
			listaComenziNormale.add(adeverinta);
		else
			listaComenziUrgente.add(adeverinta);
	}

	public void executaCereri(String denumireCategorie) throws Exception {
		
		if(denumireCategorie.equals("toate")) {
			
			if (!listaComenziUrgente.isEmpty()) {
				System.out.println("====================");
				for (IProcesatorCerere c : listaComenziUrgente) {
					c.procesareCerere(TipCerere.URGENTA, "toate");	
				}		
				listaComenziUrgente.clear();
				System.out.println("S-au procesat toate cererile urgente");
			}
			else 
				System.out.println("Nu exista cereri urgente");
				
			if (!listaComenziNormale.isEmpty()) {
				System.out.println("====================");
				for (IProcesatorCerere c : listaComenziNormale) {
					c.procesareCerere(TipCerere.NORMALA, "toate");	
				}		
				listaComenziNormale.clear();	
				System.out.println("S-au procesat toate cererile normale");
			}		
			else 
				System.out.println("Nu exista cereri normale");
		}
		
		else {
			
			if (!listaComenziUrgente.isEmpty()) {
				
				if (denumireCategorie.equals("adeverinta")) {
					for (IProcesatorCerere c : listaComenziUrgente) {
						if(c instanceof ComandaAdeverinta) {
							c.procesareCerere(TipCerere.URGENTA, denumireCategorie);
							listaComenziUrgente.remove(c);
							if(listaComenziUrgente.isEmpty())
								break;
						}
						
					}
				}
				else if (denumireCategorie.equals("diploma")) {
					for (IProcesatorCerere c : listaComenziUrgente) {
						if(c instanceof ComandaEliberareDiploma) {
							c.procesareCerere(TipCerere.URGENTA, denumireCategorie);
							listaComenziUrgente.remove(c);
							if(listaComenziUrgente.isEmpty())
								break;
						}
						
					}
				}
				else
					System.out.println("Nu exista acest tip de cerere");
			}
			else
				System.out.println("Nu exista cereri urgente pentru " + denumireCategorie);
			
			
			if (!listaComenziNormale.isEmpty()) {
				if (denumireCategorie.equals("adeverinta")) {
					for (IProcesatorCerere c : listaComenziNormale) {
						if(c instanceof ComandaAdeverinta) {
							c.procesareCerere(TipCerere.NORMALA, denumireCategorie);
							listaComenziNormale.remove(c);
							if(listaComenziNormale.isEmpty())
								break;
						}
						
					}
				}
				else if (denumireCategorie.equals("diploma")) {
					for (IProcesatorCerere c : listaComenziNormale) {
						if(c instanceof ComandaEliberareDiploma) {
							c.procesareCerere(TipCerere.NORMALA, denumireCategorie);
							listaComenziNormale.remove(c);
							if(listaComenziNormale.isEmpty())
								break;
						}
						
					}
				}
				else
					System.out.println("Nu exista acest tip de cerere");
			}
			else
				System.out.println("Nu exista cereri normale pentru " + denumireCategorie);
		}
		
		
	}
	
}
