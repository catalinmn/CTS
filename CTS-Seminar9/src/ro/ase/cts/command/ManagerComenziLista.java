package ro.ase.cts.command;

import java.util.ArrayList;
import java.util.List;

public class ManagerComenziLista {

	List<IComanda> listaComenzi;

	public ManagerComenziLista() {
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
	
	public void undo(int index){
		if(!listaComenzi.isEmpty()){
			listaComenzi.get(0).undo(index);
			listaComenzi.remove(index);
		}
	}
}
