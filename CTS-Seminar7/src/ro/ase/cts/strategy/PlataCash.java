package ro.ase.cts.strategy;

public class PlataCash implements ModPlata{

	@Override
	public void realizeazaPlata(int suma) {
		System.out.println("S-a realizat plata cu cash pentru suma de " + suma);
		
	}

}
