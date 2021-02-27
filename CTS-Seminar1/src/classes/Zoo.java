package classes;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
	
	private ZooKeeper zooKeeper;
	private List<Animal> animalList;
	
	public Zoo() {
		super();
		this.zooKeeper = new ZooKeeper("");
		this.animalList = new ArrayList<>();
	}
	
	public Zoo(ZooKeeper zooKeeper, List<Animal> animalList) {
		super();
		this.zooKeeper = zooKeeper;
		this.animalList = animalList;
	}
	
	public void addAnimal (Animal a) {
		this.animalList.add(a);
	}
	
	public void feedAnimals() {
		for(Animal a : animalList)
			this.zooKeeper.feed(a);
	}

	public void animalWalks() {
		for(Animal a : animalList)
			System.out.println(a.getNume() + "walks");
	}
}
