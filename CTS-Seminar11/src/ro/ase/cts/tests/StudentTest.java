package ro.ase.cts.tests;

import static org.junit.Assert.*;

import java.lang.reflect.Array;
import java.util.ArrayList;

import org.junit.Test;

import ro.ase.cts.clase.Student;

public class StudentTest {
	
	

	@Test
	public void testConstructorParametrii() {
		String nume = "gigel";
		Student student = new Student(nume);

		assertEquals(nume, student.getNume());
	}

	@Test
	public void testConstructor() {

		Student student = new Student();

		assertNotNull("Numele este null", student.getNume());

		assertNotNull("Lista este neinitializata", student.getNote());
	}

	@Test
	public void testGetNota() {

		Student student = new Student();

		student.adaugaNota(6);
		student.adaugaNota(7);
		student.adaugaNota(4);

		assertEquals(6, student.getNota(0));

	}

	@Test
	public void testAdaugaNota() {

		Student student = new Student();

		student.adaugaNota(6);

		assertEquals(6, student.getNota(0));

	}

	@Test
	public void testDimensiuneLista() {

		Student student = new Student();

		student.adaugaNota(6);

		assertEquals(1, student.getNote().size());
	}

	@Test
	public void testCalculMedie() {

		Student student = new Student();

		int nota1 = 5;
		int nota2 = 10;

		student.adaugaNota(nota1);
		student.adaugaNota(nota2);

		float medie1 = student.calculeazaMedie();
		float medie2 = (nota1 + nota2) / 2.0f;

		assertEquals(medie2, medie1, 0.001);
	}

	@Test
	public void testAreRestante() {

		Student student = new Student();

		int nota1 = 4;
		int nota2 = 10;

		student.adaugaNota(nota1);
		student.adaugaNota(nota2);

		assertTrue(student.areRestante());
	}

	@Test
	public void testSetNume() {

		Student student = new Student();
		String nume = "gigel";

		student.setNume(nume);

		assertEquals(nume, student.getNume());
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void testGetNotaException() {

		Student student = new Student();
		student.getNota(-1);
	}

	@Test
	public void testGetNotaExceptionGeneric() {

		Student student = new Student();

		try {

			student.getNota(-1);

			fail("Metoda nu arunca exceptie");

		} catch (IndexOutOfBoundsException ex) {

		} catch (Exception e) {

			fail("Metoda nu arunca IndexOutOfBoundsException ");
		}

	}

	@Test(expected = IllegalArgumentException.class)
	public void testNoteNegative() {

		Student student = new Student();
		student.adaugaNota(-1);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testNotePeste10() {

		Student student = new Student();
		student.adaugaNota(11);
	}

}
