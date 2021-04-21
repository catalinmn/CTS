package ro.ase.java.template;

public abstract class TemplateOcupareMasa {
	
	protected int codMasa;
	
	public TemplateOcupareMasa(int codMasa) {
		super();
		this.codMasa = codMasa;
	}
	public abstract void curataMasa();
	public abstract void aseazaServetele();
	public abstract void aseazaTacamuri();
	public abstract void invitaPersoane();
	
	public final void ocupaMasa() {
		curataMasa();
		aseazaServetele();
		aseazaTacamuri();
		invitaPersoane();
	}
}
