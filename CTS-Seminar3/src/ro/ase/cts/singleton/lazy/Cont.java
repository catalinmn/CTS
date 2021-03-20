package ro.ase.cts.singleton.lazy;

public class Cont {
	
	private String numeBeneficiar;
	private String valutaCont;
	private int balanta;
	private static Cont instantaCont = null;
	
	
	private Cont(String numeBeneficiar, String valutaCont, int balanta) {
		super();
		this.numeBeneficiar = numeBeneficiar;
		this.valutaCont = valutaCont;
		this.balanta = balanta;
	}


	public String getNumeBeneficiar() {
		return numeBeneficiar;
	}


	public void setNumeBeneficiar(String numeBeneficiar) {
		this.numeBeneficiar = numeBeneficiar;
	}


	public String getValutaCont() {
		return valutaCont;
	}


	public void setValutaCont(String valutaCont) {
		this.valutaCont = valutaCont;
	}


	public int getBalanta() {
		return balanta;
	}


	public void setBalanta(int balanta) {
		this.balanta = balanta;
	}
	
	public static Cont getInstantaCont(String numeBeneficiar, String valutaCont, int balanta){
		
		if(instantaCont == null) {
			instantaCont =  new Cont("Catalin", "RON", 100);
		}
		
		return instantaCont;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cont [numeBeneficiar=");
		builder.append(numeBeneficiar);
		builder.append(", valutaCont=");
		builder.append(valutaCont);
		builder.append(", balanta=");
		builder.append(balanta);
		builder.append("]");
		return builder.toString();
	}
	
	

}
