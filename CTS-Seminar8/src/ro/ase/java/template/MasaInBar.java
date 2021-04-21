package ro.ase.java.template;

public class MasaInBar extends Masa{

	public MasaInBar(int codMasa) {
		super(codMasa);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void aseazaTacamuri() {
		System.out.println("Masa "+ this.codMasa + " are paharele asezate");
		
	}
	
}
