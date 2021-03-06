package ro.ase.cts.readers;

import java.io.FileNotFoundException;
import java.util.List;
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

}