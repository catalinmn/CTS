package ro.ase.java.state_modifState;

public class StateOcupata implements State{

	@Override
	public void modificaState(Masa masa) {
		
		if(!(masa.getStare() instanceof StateOcupata)) {
			System.out.println("Masa cu codul " + masa.getCod() +" este acum ocupata");
			masa.setStare(this);
		}
		else {
			System.out.println("Masa cu codul " + masa.getCod() +" nu poate fi ocupata");
		}
		
	}

}
