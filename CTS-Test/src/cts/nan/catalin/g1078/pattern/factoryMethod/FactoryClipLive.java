package cts.nan.catalin.g1078.pattern.factoryMethod;

public class FactoryClipLive implements Factory{

	@Override
	public ClipAbstract creeazaClip(String denumireClip, int durata) {
		return new ClipLive(denumireClip, durata);
	}

}
