package ro.ase.cts.decorator;

public abstract class DecoratorAbstract implements CardAbstract{

	private Card card;
	
	public DecoratorAbstract(Card card) {
		super();
		this.card = card;
	}

	@Override
	public void realizeazaPlataOnline(int suma) {
		card.realizeazaPlataOnline(suma);
		
	}

	@Override
	public void realizeazaPlataNormala(int suma) {
		card.realizeazaPlataNormala(suma);
		
	}

	public abstract void platesteContactless(int suma);

	public Card getCard() {
		return card;
	}//putem sa facem atributul protected in loc sa mai facem getter
	
	
}
