package ro.ase.cts.readers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;

public class ReaderAngajat  extends ReaderAplicanti{


	public ReaderAngajat(String fileName) {
		super(fileName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Aplicant> readAplicanti() throws FileNotFoundException {
		Scanner input2 = new Scanner(new File(super.fileName));
		input2.useDelimiter(",");
		List<Aplicant> listaAplicanti = new ArrayList<Aplicant>();

		while (input2.hasNext()) {

			Angajat angajat = new Angajat();
			super.readAplicant(input2, angajat);
			int salariu = input2.nextInt();
			String ocupatie = input2.next();
			
			angajat.setSalariu(salariu);
			angajat.setOcupatie(ocupatie);
			
			listaAplicanti.add(angajat);
		}
		input2.close();
		return listaAplicanti;
	}
	
}
