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
//			String nume = input2.next();
//			String prenume = input2.next();
//			int varsta = input2.nextInt();
//			int punctaj = input2.nextInt();
//			int nr = input2.nextInt();
//			String[] vect = new String[5];
//			for (int i = 0; i < nr; i++)
//				vect[i] = input2.next();
//			int clasa = input2.nextInt();
//			String tutore = input2.next();
//			Elev e = new Elev(nume, prenume, varsta, punctaj, nr, vect, clasa, tutore);
//			listaAplicanti.add(e);
			
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
