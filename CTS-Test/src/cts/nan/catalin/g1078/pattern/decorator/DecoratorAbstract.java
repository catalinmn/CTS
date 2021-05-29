package cts.nan.catalin.g1078.pattern.decorator;

public abstract class DecoratorAbstract implements IClip{
	
	protected Clip clip;
	
	public DecoratorAbstract(Clip clip) {
		super();
		this.clip = clip;
	}

	public Clip getClip() {
		return clip;
	}

	public abstract void adaugaReclama(int durataReclama);
	
	public abstract void pornesteReclama();
	
}
