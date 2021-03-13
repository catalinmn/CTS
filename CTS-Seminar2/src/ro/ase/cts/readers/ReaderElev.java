package ro.ase.cts.readers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ro.ase.cts.clase.Elev;
import ro.ase.cts.clase.Aplicant;

public class ReaderElev extends ReaderAplicanti{


	public ReaderElev(String fileName) {
		super(fileName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Aplicant> readAplicanti() throws FileNotFoundException {
		Scanner input2 = new Scanner(new File(super.fileName));
		input2.useDelimiter(",|\n");
		List<Aplicant> listaAplicanti = new ArrayList<Aplicant>();

		while (input2.hasNext()) {
			
			Elev elev = new Elev();
			super.readAplicant(input2, elev);
			int clasa = input2.nextInt();
			String tutore = input2.next();
			
			elev.setClasa(clasa);
			elev.setTutore(tutore);
			
			listaAplicanti.add(elev);
		}

		input2.close();
		
		return listaAplicanti;
	}

}
