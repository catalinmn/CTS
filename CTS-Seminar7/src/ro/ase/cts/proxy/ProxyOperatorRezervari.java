package ro.ase.cts.proxy;

public class ProxyOperatorRezervari implements IOperatorRezervari{
	
	private OperatorRezervari operator;
	private int nrClientiMinim;

	public ProxyOperatorRezervari(OperatorRezervari operator, int nrClientiMinim) {
		super();
		this.operator = operator;
		this.nrClientiMinim = nrClientiMinim;
	}

	@Override
	public void realizeazaRezervare(String numeClient, int nrClienti) {
		if(nrClienti >= nrClientiMinim) {
			operator.realizeazaRezervare(numeClient, nrClienti);
		}
		else {
			System.out.println("Veniti fara rezervare");
		}
		
	}

}
