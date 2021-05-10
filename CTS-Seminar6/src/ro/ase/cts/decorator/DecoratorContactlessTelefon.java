package ro.ase.cts.decorator;

public class DecoratorContactlessTelefon extends DecoratorAbstract{

	public DecoratorContactlessTelefon(Card card) {
		super(card);
	}

	@Override
	public void platesteContactless(int suma) {
		
		if(super.getCard().getSold() >= suma) {
			System.out.println("A fost facuta plata contactless prin telefon in suma de: " + suma);
			int sold = super.getCard().getSold();
			sold -=suma;
			super.getCard().setSold(sold);
		}
	}

}
