package classes;

public class Zebra extends Animal{
	
	public Zebra(String nume) {
		super(nume);
		
	}	
	
	@Override
	public void walk() {
		System.out.println("Zebra walks");
	}

}
