package ro.ase.cts.readers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ro.ase.cts.clase.Student;
import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Elev;


public class ReaderStudenti extends ReaderAplicanti{


	public ReaderStudenti(String fileName) {
		super(fileName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Aplicant> readAplicanti() throws FileNotFoundException {
		Scanner input = new Scanner(new File(super.fileName));
		input.useDelimiter(",|\n");
		List<Aplicant> listaAplicanti = new ArrayList<Aplicant>();

		while (input.hasNext()) {
//			String nume = input.next();
//			String prenume = (input.next()).toString();
//			int varsta = Integer.valueOf(input.nextInt());
//			int punctaj = Integer.valueOf(input.nextInt());
//			int nr = Integer.valueOf(input.nextInt());
//			String[] vect = new String[5];
//			for (int i = 0; i < nr; i++)
//				vect[i] = input.next();
//			int an_studii = input.nextInt();
//			String facultate = (input.next()).toString();
//			Student s = new Student(nume, prenume, varsta, punctaj, nr, vect, facultate, an_studii);
//			listaAplicanti.add(s);
			
			Student student = new Student();
			super.readAplicant(input, student);
			int an_studii = input.nextInt();
			String facultate = input.next();
			
			student.setAn_studii(an_studii);
			student.setFacultate(facultate);
			
			listaAplicanti.add(student);
		}
		input.close();
		
		return listaAplicanti;
	}
}
