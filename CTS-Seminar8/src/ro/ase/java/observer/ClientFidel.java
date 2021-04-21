package ro.ase.java.observer;

public class ClientFidel implements Observer{

	private String nume;
	
	
	
	public ClientFidel(String nume) {
		super();
		this.nume = nume;
	}



	@Override
	public void primesteMesaj(String mesaj) {
		// TODO Auto-generated method stub
		System.out.println("Clientul " + this.nume + " a primit mesajul "+ mesaj );
	}

}
