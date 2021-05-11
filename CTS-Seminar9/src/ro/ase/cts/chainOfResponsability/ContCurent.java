package ro.ase.cts.chainOfResponsability;

public class ContCurent extends Cont{

	public ContCurent(int sold, String iban) {
		super(sold, iban);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void plateste(int suma) {
		
		if(super.getSold() >= suma) {
			int sold = super.getSold();
			sold -= suma;
			super.setSold(sold);
			
			System.out.println("S-a realizat plata in suma de " + suma +" din contul curent");
		}
		else {
			if(super.getUrmatorulCont() != null) {
				super.getUrmatorulCont().plateste(suma);
			}
			else {
				System.out.println("Plata refuzata");
			}
				
		}
		
	}

}
