package ro.ase.cts.decorator;

public class DecoratorContactless extends DecoratorAbstract{

	public DecoratorContactless(Card card) {
		super(card);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void platesteContactless(int suma) {
		if(super.getCard().getSold() >= suma) {
			System.out.println("A fost facuta plata prin contactless cu suma de: " + suma);
			int sold = super.getCard().getSold();
			sold -=suma;
			super.getCard().setSold(sold);
		}
		
	}

}
