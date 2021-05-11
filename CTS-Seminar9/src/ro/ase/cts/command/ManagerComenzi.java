package ro.ase.cts.command;

import java.util.ArrayList;
import java.util.List;

public class ManagerComenzi {

	List<IComanda> listaComenzi;

	public ManagerComenzi() {
		super();
		this.listaComenzi = new ArrayList<IComanda>();
	}
	
	public void invoca(IComanda comanda) {
		listaComenzi.add(comanda);
	}
	
	public void executaComanda() throws Exception {
		if (listaComenzi.isEmpty()) throw new Exception();
		
		listaComenzi.get(0).executa();
		listaComenzi.remove(0);
	}
	
	public void executaToateComenzile(){
		for (IComanda c : listaComenzi) {
			c.executa();
		}
		
		listaComenzi.clear();	
	}
}
