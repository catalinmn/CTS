package ro.ase.cts.composite.program;

import ro.ase.cts.composite.AgentieComposite;
import ro.ase.cts.composite.FilialaFrunza;

public class Main {

	public static void main(String[] args) throws Exception {

		AgentieComposite a1 = new AgentieComposite("a1");
		AgentieComposite a2 = new AgentieComposite("a2");
		
		FilialaFrunza f1 = new FilialaFrunza("f1");
		FilialaFrunza f2 = new FilialaFrunza("f2");
		FilialaFrunza f3 = new FilialaFrunza("f3");
		
		a1.adaugaSediu(f1);
		a2.adaugaSediu(f3);
		a2.adaugaSediu(f3);
		
		a1.adaugaSediu(a2);
		
		a1.descriere();
	}

}
