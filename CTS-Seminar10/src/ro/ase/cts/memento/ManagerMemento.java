package ro.ase.cts.memento;

import java.util.ArrayList;
import java.util.List;

public class ManagerMemento {
	
	private List<Memento> listaMeciuri;

	public ManagerMemento() {
		super();
		this.listaMeciuri = new ArrayList<>();
	}

	public void adaugaMemento(Memento memento){
		listaMeciuri.add(memento);
	}
	
	public Memento getMemento(int index){
		
		if(index >= 0 && index < listaMeciuri.size())
			return listaMeciuri.get(index);
		else
			throw new IndexOutOfBoundsException();
	}
	
	public Memento getLastMemento() throws Exception{
		if(listaMeciuri.size()!=0){
			Memento memento = listaMeciuri.get(listaMeciuri.size()-1);
			listaMeciuri.remove(listaMeciuri.size()-1);
			return memento;			
		} else {
			throw new Exception("Nu exista stari salvate");
		}
	}
}
