package ro.ase.java.observer;

import java.util.ArrayList;
import java.util.List;

public class Restaurant implements Observabil{

	private List<Observer>  observerList;
	private String nume;
	private String adresa;
	
	
	public Restaurant(String nume, String adresa) {
		super();
		this.nume = nume;
		this.adresa = adresa;
		this.observerList = new ArrayList<>();
	}
	
	
	@Override
	public void adaugaObserver(Observer observer) {
		// TODO Auto-generated method stub
		this.observerList.add(observer);
	}
	
	@Override
	public void stergeObserver(Observer observer) {
		// TODO Auto-generated method stub
		this.observerList.remove(observer);
	}
	
	@Override
	public void trimiteMesaj(String mesaj) {
		// TODO Auto-generated method stub
		for (Observer observer : this.observerList)
			observer.primesteMesaj("Restaurantul " + this.nume + " va trimite urmatorul mesaj: "+ mesaj);
	}
	
	public void realizeazaOfertaPret() {
		trimiteMesaj("S-a realizat o oferta de pret");
	}
	
	public void introducereMeniu() {
		trimiteMesaj("S-a introdus un nou meniu");
	}
	
}
