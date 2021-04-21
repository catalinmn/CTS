package ro.ase.java.state_modifState;

public class StateLibera implements State {

	@Override
	public void modificaState(Masa masa) {
		// TODO Auto-generated method stub
		if(!(masa.getStare() instanceof StateLibera)) {
			System.out.println("Masa cu codul " + masa.getCod() +" este acum eliberata");
			masa.setStare(this);
		}
		else {
			System.out.println("Masa cu codul " + masa.getCod() +" este deja eliberata");
		}
	}

}
