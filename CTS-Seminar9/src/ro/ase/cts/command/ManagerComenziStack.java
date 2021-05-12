package ro.ase.cts.command;

import java.util.Stack;

public class ManagerComenziStack {

	Stack<IComanda> listaComenzi;

	public ManagerComenziStack() {
		super();
		this.listaComenzi = new Stack<IComanda>();
	}
	
	public void invoca(IComanda comanda) {
		listaComenzi.push(comanda);
	}
	
	public void executaComanda() throws Exception {
		if (listaComenzi.isEmpty()) throw new Exception("Lista este goala");
		
		listaComenzi.remove(0).executa();

	}
	
	public void executaToateComenzile(){
		for (IComanda c : listaComenzi) {
			c.executa();
		}
		
		listaComenzi.clear();	
	}
	
	public void undo(int index){
		if(!listaComenzi.isEmpty()){
			listaComenzi.pop().undo(index);
		}
	}
}
