package ro.ase.cts.adapter;

public class AdapterObiect implements BiletOnline{
	
	private Bilet bilet;
	
	public AdapterObiect(Bilet bilet) {
		this.bilet = bilet;
	}

	@Override
	public void vindeBiletOnline() {
		this.bilet.vinde();
		
	}

	@Override
	public void rezervaBiletOnline() {
		this.bilet.rezerva();
		
	}

}
