package ro.ase.java.template;

public class Masa extends TemplateOcupareMasa{

	public Masa(int codMasa) {
		super(codMasa);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void curataMasa() {
		System.out.println("Masa "+ this.codMasa + " este curatata");
		
	}

	@Override
	public void aseazaServetele() {
		System.out.println("Masa "+ this.codMasa + " are servetele asezata");
		
	}

	@Override
	public void aseazaTacamuri() {
		System.out.println("Masa "+ this.codMasa + " are tacamurile asezate");
		
	}

	@Override
	public void invitaPersoane() {
		System.out.println("La masa "+ this.codMasa + " au fost invitate persoanele");
		
	}

}
