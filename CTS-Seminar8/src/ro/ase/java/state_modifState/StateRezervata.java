package ro.ase.java.state_modifState;

public class StateRezervata implements State{

	@Override
	public void modificaState(Masa masa) {
		
		if(masa.getStare() instanceof StateLibera) {
			System.out.println("Masa cu codul " + masa.getCod() +" este rezervata");
			masa.setStare(this);
		}
		else {
			System.out.println("Masa cu codul " + masa.getCod() +" nu poate fi rezervata");
		}
		
	}

}
