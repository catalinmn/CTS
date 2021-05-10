package ro.ase.cts.decorator.program;

import ro.ase.cts.decorator.Card;
import ro.ase.cts.decorator.DecoratorContactless;
import ro.ase.cts.decorator.DecoratorContactlessTelefon;

public class Main {

	public static void main(String[] args) {
		
		Card card1 = new Card("A", 150);
		card1.realizeazaPlataNormala(30);
		card1.realizeazaPlataOnline(30);
		
		DecoratorContactless plataDecorata = new DecoratorContactless(card1);
		plataDecorata.platesteContactless(30);
		plataDecorata.realizeazaPlataNormala(5);
		plataDecorata.realizeazaPlataOnline(5);
		
		DecoratorContactlessTelefon plataDecorataTelefon = new DecoratorContactlessTelefon(card1);
		plataDecorataTelefon.platesteContactless(30);
	
	}

}
