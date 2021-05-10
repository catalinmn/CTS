package ro.ase.cts.composite;

public class FilialaFrunza implements Sediu {

	private String nume;
	
	public FilialaFrunza(String nume) {
		super();
		this.nume = nume;
	}

	@Override
	public void descriere() {
		System.out.println(" Filiala "+nume);

	}

	//Metodele vor arunca exceptii pentru ca aceasta clasa este "frunza" si nu le poate implementa
	@Override
	public void adaugaSediu(Sediu sediu) throws Exception{
		throw new Exception();

	}

	@Override
	public void stergeSediu(Sediu sediu) throws Exception{
		throw new Exception();

	}

	@Override
	public Sediu getSediu(int pozitie) throws Exception{
		throw new Exception();

	}

}
