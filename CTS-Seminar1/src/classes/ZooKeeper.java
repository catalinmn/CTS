package classes;

public class ZooKeeper {
	
	private String nume;

	public ZooKeeper(String nume) {
		super();
		this.nume = nume;
	}
	
	public void feed(Animal a) {
		System.out.println("Zookeeper " + this.nume + " feeds " + a.getNume());
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}
		
}
