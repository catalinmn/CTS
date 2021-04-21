package ro.ase.java.template.main;

import ro.ase.java.template.Masa;
import ro.ase.java.template.MasaInBar;
import ro.ase.java.template.TemplateOcupareMasa;

public class Main {

	public static void main(String[] args) {

		TemplateOcupareMasa masa = new Masa(23);
		masa.ocupaMasa();
		
		
		TemplateOcupareMasa masa2 = new MasaInBar(30);
		masa2.ocupaMasa();
	}

}
