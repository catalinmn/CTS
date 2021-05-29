package cts.nan.catalin.g1078.pattern.decorator;

import cts.nan.catalin.g1078.pattern.factoryMethod.IClip;

public class Clip implements IClip {

	private String numeClip;
	private int durata;

	public Clip(String numeClip, int durata) {
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

	public int getDurata() {
		return durata;
	}

	public void setDurata(int durata) {
		this.durata = durata;
	}

	public String getNumeClip() {
		return numeClip;
	}	
	
	

}
