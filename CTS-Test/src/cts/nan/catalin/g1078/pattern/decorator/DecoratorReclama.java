package cts.nan.catalin.g1078.pattern.decorator;


public class DecoratorReclama extends DecoratorAbstract{

	private Boolean areReclama;
	
	public DecoratorReclama(Clip clip) {
		super(clip);
		this.areReclama = false;
	}

	@Override
	public void adaugaReclama(int durataReclama) {
		System.out.println("A fost adaugata reclama cu durata de " + durataReclama);
		super.clip.setDurata( super.clip.getDurata() + durataReclama);
		this.areReclama =true;
	}

	@Override
	public void pornesteReclama() {
		if (this.areReclama)
			System.out.println("Reclama a fost pornita");
		else
			System.out.println("Clipul inca nu are o reclama");
		
	}

	@Override
	public void pause() {
		if (this.areReclama)
			System.out.println("Reclama a fost pornita, nu se pot face modificari");
		else
			System.out.println("Clip " + super.getClip().getNumeClip() +" paused");
		
	}

	@Override
	public void stop() {
		if (this.areReclama)
			System.out.println("Reclama a fost pornita, nu se pot face modificari");
		else
			System.out.println("Clip " + super.getClip().getNumeClip()  +" stopped");
		
	}

	@Override
	public void resume() {
		if (this.areReclama)
			System.out.println("Reclama a fost pornita, nu se pot face modificari");
		else
			System.out.println("Clip " + super.getClip().getNumeClip()  +" resumed");
	}

	@Override
	public void start() {
		if (this.areReclama)
			System.out.println("Reclama a fost pornita, nu se pot face modificari");
		else
			System.out.println("Clip " + super.getClip().getNumeClip()  +" started");
		
	}
	
	
}