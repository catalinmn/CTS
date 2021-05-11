package ro.ase.cts.command;

public class ComandaRetragere implements IComanda{

	private ContBancar cont;
	private double sumaRetrasa;
	
	public ComandaRetragere(ContBancar cont, double sumaRetrasa) {
		super();
		this.cont = cont;
		this.sumaRetrasa = sumaRetrasa;
	}

	@Override
	public void executa() {
		cont.retragere(sumaRetrasa);
	}

}
