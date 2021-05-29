package cts.nan.catalin.g1078.main;

import cts.nan.catalin.g1078.pattern.factoryMethod.ClipAbstract;
import cts.nan.catalin.g1078.pattern.factoryMethod.Factory;
import cts.nan.catalin.g1078.pattern.factoryMethod.FactoryClipLive;
import cts.nan.catalin.g1078.pattern.factoryMethod.FactoryClipTutorial;

public class MainFactoryMethod {
	
	private static ClipAbstract creeazaClip(Factory factory, String denumireClip, int durata) {
		 ClipAbstract clip = factory.creeazaClip(denumireClip, durata);
		 return clip;
	}

	public static void main(String[] args) {
		
		ClipAbstract clipLive1 = creeazaClip(new FactoryClipLive(),"clipLive1", 10);
		ClipAbstract clipLive2 = creeazaClip(new FactoryClipLive(),"clipLive2", 20);
		
		ClipAbstract clipTutorial1 = creeazaClip(new FactoryClipTutorial(),"clipTutorial1", 30);
		ClipAbstract clipTutorial2 = creeazaClip(new FactoryClipTutorial(),"clipTutorial2", 40);
		
		clipLive1.pause();
		clipLive2.start();
		
		clipTutorial1.resume();
		clipTutorial2.stop();
	}

}
