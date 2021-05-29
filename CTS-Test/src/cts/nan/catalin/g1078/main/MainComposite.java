package cts.nan.catalin.g1078.main;

import cts.nan.catalin.g1078.pattern.composite.Clip;
import cts.nan.catalin.g1078.pattern.composite.Playlist;

public class MainComposite {

	public static void main(String[] args) {

		Clip c1 = new Clip("Clip 1", 10);
		Clip c2 = new Clip("Clip 2", 20);
		Clip c3 = new Clip("Clip 3", 30);
		
		Playlist playlist = new Playlist("playlist1");
		
		playlist.adauga(c1);
		playlist.adauga(c2);
		
		Playlist playlistLevel2 = new Playlist("playlistLevel2");
		
		Clip c4 = new Clip("Clip 4", 10);
		Clip c5 = new Clip("Clip 5", 20);
		
		playlistLevel2.adauga(c4);
		playlistLevel2.adauga(c5);
		
		playlist.adauga(playlistLevel2);
		playlist.adauga(c3);
		
		Playlist playlistLevel3 = new Playlist("playlistLevel3");
		
		Clip c6 = new Clip("Clip 6", 10);
		Clip c7 = new Clip("Clip 7", 20);
		
		playlistLevel3.adauga(c6);
		playlistLevel3.adauga(c7);
		
		playlist.adauga(playlistLevel3);
		
		playlist.start();
	}

}
