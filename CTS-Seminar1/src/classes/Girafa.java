package classes;

public class Girafa extends Animal{
	
	private int height;

	public Girafa(String nume, int height) {
		super(nume);
		this.height = height;
	}
	
	@Override
	public void walk() {
		System.out.println("Girafa walks");
	}

}
