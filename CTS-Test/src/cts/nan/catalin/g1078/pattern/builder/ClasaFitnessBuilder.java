package cts.nan.catalin.g1078.pattern.builder;

import java.util.ArrayList;
import java.util.List;

public class ClasaFitnessBuilder implements IClasaFitness {

	private ClasaFitness clasaFitness;
	private String numeAntrenor;
	private int durata;
	private Dificultate dificultate;
	private int nrParticipanti;
	private int pret;
	private List<String> listaExercitii;
	
	public ClasaFitnessBuilder() {
		super();
		this.clasaFitness = new ClasaFitness("", 0, null, 0, 0, listaExercitii);
	}

	public ClasaFitnessBuilder setNumeAntrenor(String nume) {
		if(this.clasaFitness.getCreat() == false) {
			this.clasaFitness.setNumeAntrenor(nume);
		}
		else
			System.out.println("Nu se pot face modificari");
		
		return this;
	}
	
	public ClasaFitnessBuilder setDurata(int durata) {
		if(this.clasaFitness.getCreat() == false) {
			this.clasaFitness.setDurata(durata);
		}
		else
			System.out.println("Nu se pot face modificari");
		
		return this;
	}
	
	public ClasaFitnessBuilder setDificultate(Dificultate dificultate) {
		if(this.clasaFitness.getCreat() == false) {
			this.clasaFitness.setDificultate(dificultate);
		}
		else
			System.out.println("Nu se pot face modificari");
		
		return this;
	}
	
	public ClasaFitnessBuilder setNrParticipanti(int nrParticipanti) {
		if(this.clasaFitness.getCreat() == false) {
			this.clasaFitness.setNrParticipanti(nrParticipanti);
		}
		else
			System.out.println("Nu se pot face modificari");

		return this;
	}
	
	public ClasaFitnessBuilder setPret(int pret) {
		if(this.clasaFitness.getCreat() == false) {
			this.clasaFitness.setPret(pret);
		}
		else
			System.out.println("Nu se pot face modificari");

		return this;
	}
	
	public ClasaFitnessBuilder adaugaExercitiu(List<String> listaExercitii) {
		if(this.clasaFitness.getCreat() == false) {
			this.clasaFitness.setListaExercitii(listaExercitii);
		}
		else
			System.out.println("Nu se pot face modificari");
		
		return this;
	}
	
	@Override
	public ClasaFitness build() {
		this.clasaFitness.setCreat(true);
		return this.clasaFitness;
	}

}
