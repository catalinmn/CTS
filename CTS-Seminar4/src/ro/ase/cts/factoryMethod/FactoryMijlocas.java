package ro.ase.cts.factoryMethod;

public class FactoryMijlocas implements Factory{

	@Override
	public Jucator creeazaJucator(String numeJucator) {
		
		return new Mijlocas(numeJucator);
	}

}
