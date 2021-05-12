package ro.ase.cts.command.program;

import ro.ase.cts.command.ComandaConstituire;
import ro.ase.cts.command.ComandaDepunere;
import ro.ase.cts.command.ComandaRetragere;
import ro.ase.cts.command.ContBancar;
import ro.ase.cts.command.ManagerComenziLista;
import ro.ase.cts.command.ManagerComenziStack;

public class Main {

	public static void main(String[] args) throws Exception {
		
//		ManagerComenziLista manager = new ManagerComenziLista();
//		ContBancar cont = new ContBancar("Iban123", 0);
//		
//		manager.invoca(new ComandaConstituire(cont, 1000));
//		manager.invoca(new ComandaDepunere(cont, 500));
//		
//		manager.executaComanda();
//		
//		manager.invoca(new ComandaRetragere(cont, 700));
//		manager.invoca(new ComandaRetragere(cont, 900));
//		
//		manager.undo(1);
//		manager.executaComanda();
//		
//		manager.executaToateComenzile();
		
		
		ManagerComenziStack managerStack = new ManagerComenziStack();
		ContBancar contStack = new ContBancar("Iban123", 0);
		
		managerStack.invoca(new ComandaConstituire(contStack, 1000));
		managerStack.invoca(new ComandaDepunere(contStack, 500));
		
		managerStack.executaComanda();
		
		managerStack.executaComanda();
		
		managerStack.invoca(new ComandaRetragere(contStack, 700));
		managerStack.undo(0);
		
		managerStack.invoca(new ComandaRetragere(contStack, 900));
		
		//managerStack.undo(0);//am lasat index aici ca sa folosesc si pentru stack si pt lista, chiar daca la stack o sa imi scoata ultimul obiect din lista, indiferent ce ii trimit
		managerStack.executaComanda();
		
		managerStack.executaToateComenzile();
		
		
		
	}

}
