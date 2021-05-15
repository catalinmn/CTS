package ro.ase.cts.memento.program;

import javax.net.ssl.ManagerFactoryParameters;

import ro.ase.cts.memento.ManagerMemento;
import ro.ase.cts.memento.MeciJucat;
import ro.ase.cts.memento.Memento;

public class Main {

	public static void main(String[] args) throws Exception {
		MeciJucat meci1 = new MeciJucat("echipa1", "echipa2", 10, 20, 30);
		
		Memento memento = meci1.creareMemento();
		ManagerMemento manager = new ManagerMemento();
		manager.adaugaMemento(memento);
		
		meci1.setEchipaGazda("echipa3");
		meci1.setEchipaOaspeti("echipa4");
		meci1.setNrBileteVandute(15);
		meci1.setNrSpectatori(40);
		
		manager.adaugaMemento(meci1.creareMemento());
		
		System.out.println(meci1.toString());
		meci1.setMemento(manager.getMemento(0));
		System.out.println(meci1.toString());
		
		meci1.setMemento(manager.getLastMemento());
		System.out.println(meci1.toString());
	}

}
