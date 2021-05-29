package cts.nan.catalin.g1078.pattern.factoryMethod;

public class FactoryClipTutorial implements Factory{

	@Override
	public ClipAbstract creeazaClip(String denumireClip, int durata) {
		return new ClipTutorial(denumireClip, durata);
	}

}
