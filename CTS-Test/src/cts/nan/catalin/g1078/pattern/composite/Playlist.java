package cts.nan.catalin.g1078.pattern.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Playlist implements IClip{
	
	private String denumirePlaylist;
	private List<IClip> listaClipuri;
	
	public Playlist(String denumirePlaylist) {
		super();
		this.denumirePlaylist = denumirePlaylist;
		this.listaClipuri = new ArrayList<IClip>();
	}

	@Override
	public void pause() {
		if(!listaClipuri.isEmpty()) {
			listaClipuri.get(0).pause();
		}
		else
			System.out.println("Nu exista clipuri in playlist "+this.denumirePlaylist);
	}
	
	@Override
	public void stop() {
		if(!listaClipuri.isEmpty()) {
			listaClipuri.get(0).stop();
		}
		else
			System.out.println("Nu exista clipuri in playlistul " +this.denumirePlaylist);
	}
	
	@Override
	public void resume() {
		if(!listaClipuri.isEmpty()) {
			listaClipuri.get(0).resume();
		}
		else
			System.out.println("Nu exista clipuri in playlistul " +this.denumirePlaylist);
	}
	
	@Override
	public void start() {
		if(!listaClipuri.isEmpty()) {
			System.out.println("Playlistul " + this.denumirePlaylist + " started");
			
			Iterator<IClip> i = listaClipuri.iterator();
			while (i.hasNext()) {
			   IClip c = i.next();
			   c.start();
			   c.pause();
			   c.resume();
			   c.stop();
			   i.remove();
			}
		}
		else
			System.out.println("Nu exista clipuri in playlistul "+this.denumirePlaylist);
			
	}
	
	public void adauga(IClip iClip){
		listaClipuri.add(iClip);
		
	}
	
	public void sterge(IClip iClip){
		listaClipuri.remove(iClip);
	}
}
