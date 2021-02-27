package ro.ase.cts;

import classes.Animal;
import classes.Girafa;
import classes.Zebra;
import classes.Zoo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Zoo zoo = new Zoo();
		
		Animal z1 = new Zebra("Z1");
		Animal z2 = new Zebra("Z2");
		
		Animal g1 = new Girafa("G1", 20);
		Animal g2 = new Girafa("G2", 30);
		
		zoo.addAnimal(z1);
		zoo.addAnimal(z2);
		
		zoo.addAnimal(g1);
		zoo.addAnimal(g2);
		
		zoo.feedAnimals();
		zoo.animalWalks();
		
	}

}
