package ro.ase.cts.composite;

import java.util.ArrayList;
import java.util.List;

public class AgentieComposite implements Sediu {
	
	private String nume;
	private List<Sediu> listaSedii;
	
	public AgentieComposite(String nume) {
		super();
		this.nume = nume;
		this.listaSedii = new ArrayList<Sediu>();
	}

	@Override
	public void descriere() {
		System.out.println("Agentie " + nume);
		for(int i = 0; i<listaSedii.size(); i++) {
			listaSedii.get(i).descriere();
		}
	}

	@Override
	public void adaugaSediu(Sediu sediu) throws Exception {
		listaSedii.add(sediu);
		
	}

	@Override
	public void stergeSediu(Sediu sediu) throws Exception {
		listaSedii.remove(sediu);
		
	}

	@Override
	public Sediu getSediu(int pozitie) throws Exception {

		if(pozitie <0 || pozitie >= listaSedii.size())
			throw new Exception();
		
		return listaSedii.get(pozitie);
	}

}
