package cts.nan.catalin.g1078.pattern.state;

public class CerereStudent implements ICerereStudent{
	
	private String motiv;
	private String numeStudent;
	private int termen;
	private State stare;
	
	public CerereStudent(String descriere, String numeStudent) {
		super();
		this.motiv = descriere;
		this.numeStudent = numeStudent;
		this.termen = 0;
		this.stare = new StateTrimisaPeFlux();
	}

	public void trimiterePeFlux() {
		StateTrimisaPeFlux stateTrimisaPeFlux  = new StateTrimisaPeFlux();
		stateTrimisaPeFlux.modificaStare(this);
	}
	
	@Override
	public void confirmare() {
		StateConfirmata stateConfirmata = new StateConfirmata();
		stateConfirmata.modificaStare(this);
		
	}

	@Override
	public void verificare() {
		StateVerificata stateVerificata= new StateVerificata();
		stateVerificata.modificaStare(this);
	}

	@Override
	public void avizareDecanat() {
		StateAvizareDecanat stateAvizareDecanat= new StateAvizareDecanat();
		stateAvizareDecanat.modificaStare(this);
	}

	@Override
	public void respingere() {
		StateRespinsa stateRespinsa = new StateRespinsa();
		stateRespinsa.modificaStare(this);
	}
	
	public State getStare() {
		return stare;
	}

	void setStare(State stare) {
		this.stare = stare;
	}

	
	public String getMotiv() {
		return motiv;
	}

	public String getNumeStudent() {
		return numeStudent;
	}

	public int getTermen() {
		return termen;
	}

	public void setTermen(int termen) {
		this.termen = termen;
	}
	
	

}
