package ro.ase.cts.command;

public class ComandaDepunere implements IComanda{

	private ContBancar cont;
	private double sumaDepusa;
	
	public ComandaDepunere(ContBancar cont, double sumaDepusa) {
		super();
		this.cont = cont;
		this.sumaDepusa = sumaDepusa;
	}

	@Override
	public void executa() {
		cont.depunere(sumaDepusa);
	}

}
