package ro.ase.cts.flyweight;

import java.util.HashMap;

public class FlyweightFactory {

	private HashMap<String, Client> map;

	public FlyweightFactory() {
		this.map = new HashMap<>();
	}
	
	public Client getClient(String nrTelefon) {
		
		Client client = map.get(nrTelefon);
		
		if(client == null) {
			client = new Client("Ion", nrTelefon, "email");
			map.put(nrTelefon, client);
		}
		return client;
	}
}
