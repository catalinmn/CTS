package ro.ase.cts.teste;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import ro.ase.cts.categories.TesteGetPromovabilitate;
import ro.ase.cts.categories.TesteUrgente;
import ro.ase.cts.clase.Grupa;
import ro.ase.cts.clase.Student;
import ro.ase.cts.mocks.StudentDummy;
import ro.ase.cts.mocks.StudentFake;
import ro.ase.cts.mocks.StudentStub;

public class TestGrupaWithMocks {

	@Test
	@Category(TesteUrgente.class)
	public void testAdaugareStudent() {
		
		StudentDummy student = new StudentDummy();
		Grupa grupa = new Grupa(1100);
		
		grupa.adaugaStudent(student);
		
		assertEquals(1, grupa.getStudenti().size());
	}

	@Test
	@Category({TesteGetPromovabilitate.class, TesteUrgente.class})
	public void testGetPromovabilitate() {
		
		StudentStub student = new StudentStub();
		Grupa grupa = new Grupa(1100);
		
		grupa.adaugaStudent(student);
		
		assertEquals(0, grupa.getPromovabilitate(), 0.01);
	}
	
	@Test
	public void testGrupaWithFakeRight() {
	
		// 10 student - 7 integralisti + 3 restantieri
		
		int nrIntegralisti = 7;
		int nrRestantieri = 3;
		Grupa grupa = new Grupa(1078);
		for (int i =0; i<nrIntegralisti; i++) {
			StudentFake student = new StudentFake();
			student.setValoareAreRestanta(false);
			grupa.adaugaStudent(student);
		}
		for (int i =0; i<nrRestantieri; i++) {
			StudentFake student = new StudentFake();
			student.setValoareAreRestanta(true);
			grupa.adaugaStudent(student);
		}
		
		assertEquals(0.7, grupa.getPromovabilitate(), 0.01);
	}
	
	
}
