package cts.nan.catalin.g1078.pattern.builder;

import java.util.List;

public class ClasaFitness {
	
	private Boolean creat = false;
	private String numeAntrenor;
	private int durata;
	private Dificultate dificultate;
	private int nrParticipanti;
	private int pret;
	private List<String> listaExercitii;
	
	public ClasaFitness(String numeAntrenor, int durata, Dificultate dificultate, int nrParticipanti, int pret,
			List<String> listaExercitii) {
		super();
		this.numeAntrenor = numeAntrenor;
		this.durata = durata;
		this.dificultate = dificultate;
		this.nrParticipanti = nrParticipanti;
		this.pret = pret;
		this.listaExercitii = listaExercitii;
	}
	
	public void setCreat(Boolean creat) {
		this.creat = creat;
	}

	public void setNumeAntrenor(String numeAntrenor) {
		this.numeAntrenor = numeAntrenor;
	}

	public void setDurata(int durata) {
		this.durata = durata;
	}

	public void setDificultate(Dificultate dificultate) {
		this.dificultate = dificultate;
	}

	public void setNrParticipanti(int nrParticipanti) {
		this.nrParticipanti = nrParticipanti;
	}

	public void setPret(int pret) {
		this.pret = pret;
	}

	public void setListaExercitii(List<String> listaExercitii) {
		this.listaExercitii = listaExercitii;
	}

	public Boolean getCreat() {
		return creat;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ClasaFitness [numeAntrenor=");
		builder.append(numeAntrenor);
		builder.append(", durata=");
		builder.append(durata);
		builder.append(", dificultate=");
		builder.append(dificultate);
		builder.append(", nrParticipanti=");
		builder.append(nrParticipanti);
		builder.append(", pret=");
		builder.append(pret);
		builder.append(", listaExercitii=");
		builder.append(listaExercitii);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
