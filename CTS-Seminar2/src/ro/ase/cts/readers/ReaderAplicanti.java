package ro.ase.cts.readers;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

import ro.ase.cts.clase.Aplicant;

//Clasele Reader vor implementa aceasta interfata pentru ca in Program am creat o functie 
// care dorim sa primeasca parametrii generici
// iar pentru ca acest lucru sa fie posibil toate clasele reader trebuie sa
// aiba aceeasi "baza" aceasta fiind interfata pe care o implementeaza
// putea sa fie si clasa abstracta, principiul este acelasi

//public interface IReaderAplicanti {
//
//	List<Aplicant> readAplicanti(String file) throws FileNotFoundException;
//
//
//}

public abstract class ReaderAplicanti {
	
	protected String fileName;
		
	public ReaderAplicanti(String fileName) {
		super();
		this.fileName = fileName;
	}

	public List<Aplicant> readAplicanti() throws FileNotFoundException{
		return null;
		
	};
	
	public void readAplicant(Scanner input, Aplicant aplicant) {
		
		String nume = input.next();
		String prenume = input.next();
		int varsta = input.nextInt();
		int punctaj = input.nextInt();
		int nr = input.nextInt();
		String[] vect = new String[5];
		for (int i = 0; i < nr; i++)
			vect[i] = input.next();
		
		aplicant.setNume(nume);
		aplicant.setPrenume(prenume);
		aplicant.setVarsta(varsta);
		aplicant.setPunctaj(punctaj);
		aplicant.setProiecte(vect, nr);
	}

}