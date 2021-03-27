package ro.ase.cts.factoryMethod;

public class FactoryAtacant implements Factory{

	@Override
	public Jucator creeazaJucator(String numeJucator) {
		
		return new Atacant(numeJucator);
	}

}
