package cts.nan.catalin.g1078.main;

import cts.nan.catalin.g1078.pattern.strategy.ChallengeFlotari;
import cts.nan.catalin.g1078.pattern.strategy.ChallengeSalturi;
import cts.nan.catalin.g1078.pattern.strategy.Trainer;

public class MainStrategy {
	
	public static void main(String[] args) {
		
		Trainer trainer = new Trainer("Ion");
	
		trainer.schimbaExercitiu(new ChallengeFlotari());
		trainer.incepeExercitiu(3);
		
		trainer.schimbaExercitiu(new ChallengeSalturi());
		trainer.incepeExercitiu(10);
		
		trainer.schimbaExercitiu(new ChallengeFlotari());
		trainer.incepeExercitiu(6);
	}
}
