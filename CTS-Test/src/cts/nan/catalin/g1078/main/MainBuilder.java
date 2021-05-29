package cts.nan.catalin.g1078.main;

import cts.nan.catalin.g1078.pattern.builder.ClasaFitness;
import cts.nan.catalin.g1078.pattern.builder.ClasaFitnessBuilder;
import cts.nan.catalin.g1078.pattern.builder.Dificultate;

public class MainBuilder {
	
	public static void main(String[] args) {
		
		ClasaFitnessBuilder builder = new ClasaFitnessBuilder();
		
		ClasaFitness clasa1 = builder.setDificultate(Dificultate.Avansat).setPret(100).setNumeAntrenor("Ionel").build();
		
		System.out.println(clasa1);
		clasa1 = builder.setNrParticipanti(10).setDurata(60).build();
		System.out.println(clasa1);
	}


}
