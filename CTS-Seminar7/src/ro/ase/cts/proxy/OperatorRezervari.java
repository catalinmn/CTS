package ro.ase.cts.proxy;

public class OperatorRezervari implements IOperatorRezervari {

	@Override
	public void realizeazaRezervare(String numeClient, int nrClienti) {
		System.out.println("A fost realizata rezervarea pentru " + nrClienti + " pe numele " + numeClient);
		
	}

}
