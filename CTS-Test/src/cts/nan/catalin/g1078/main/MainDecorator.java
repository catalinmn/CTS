package cts.nan.catalin.g1078.main;

import cts.nan.catalin.g1078.pattern.decorator.Clip;
import cts.nan.catalin.g1078.pattern.decorator.DecoratorReclama;

public class MainDecorator {

	public static void main(String[] args) {

		Clip clip = new Clip("clip1", 10);
		System.out.println("Durata clipului este de " + clip.getDurata());
		
		clip.pause();
		clip.start();
		clip.stop();
		clip.resume();
		
		DecoratorReclama decorator = new DecoratorReclama(clip);
		decorator.pornesteReclama();
		decorator.adaugaReclama(10);
		System.out.println("Durata clipului este de " +decorator.getClip().getDurata());
		decorator.pornesteReclama();
		decorator.pause();
		decorator.resume();
		

	}

}
