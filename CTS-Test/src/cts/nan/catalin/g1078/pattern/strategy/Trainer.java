package cts.nan.catalin.g1078.pattern.strategy;

public class Trainer {
	
	private String nume;
	private IChallenge exercitiu;
	
	public Trainer(String nume) {
		super();
		this.nume = nume;
	}

	public void schimbaExercitiu(IChallenge exercitiu) {
		this.exercitiu = exercitiu;
	}
	
	public void incepeExercitiu(int nrRepetitii) {
		exercitiu.startExercitiu(nrRepetitii);
	}

}
