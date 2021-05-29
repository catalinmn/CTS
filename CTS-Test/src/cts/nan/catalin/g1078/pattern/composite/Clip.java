package cts.nan.catalin.g1078.pattern.composite;

public class Clip implements IClip{

	private String denumireClip;
	private int durata;
	
	public Clip(String denumireClip, int durata) {
		super();
		this.denumireClip = denumireClip;
		this.durata = durata;
	}

	@Override
	public void pause() {
		System.out.println("Clipul " + denumireClip + " paused");
	}

	@Override
	public void stop() {
		System.out.println("Clipul " + denumireClip + " stopped");	
	}

	@Override
	public void resume() {
		System.out.println("Clipul " + denumireClip + " resumed");	
	}

	@Override
	public void start() {
		System.out.println("Clipul " + denumireClip + " started");
	}
}
