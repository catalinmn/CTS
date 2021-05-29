package cts.nan.catalin.g1078.pattern.factoryMethod;

public class ClipAbstract implements IClip{

	private String numeClip;
	private int durata;

	public ClipAbstract(String numeClip, int durata) {
		super();
		this.numeClip = numeClip;
		this.durata = durata;
	}

	@Override
	public void pause() {

		System.out.println("Clip " + this.numeClip +" paused");

	}

	@Override
	public void stop() {
		System.out.println("Clip " + this.numeClip  +" stopped");

	}

	@Override
	public void resume() {
		System.out.println("Clip " + this.numeClip  +" resumed");

	}

	@Override
	public void start() {
		System.out.println("Clip " + this.numeClip  +" started");

	}	

}
