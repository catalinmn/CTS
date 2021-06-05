package ro.ase.cts.teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import ro.ase.cts.categories.TesteGetPromovabilitate;
import ro.ase.cts.categories.TesteUrgente;
import ro.ase.cts.clase.Grupa;
import ro.ase.cts.clase.Student;

public class TestGrupa {
	

	@Test
	@Category(TesteUrgente.class)
	public void testConstructorRight() {
		Grupa grupa = new Grupa(1078);
		assertEquals(1078, grupa.getNrGrupa());
	}
	
	@Test
	public void testConstructorLimitaInferioara() {
		Grupa grupa = new Grupa (1000);
		
		assertEquals(1000, grupa.getNrGrupa());
	}
	
	@Test
	public void testConstructorLimitaSuperioara() {
		Grupa grupa = new Grupa (1100);
		
		assertEquals(1100, grupa.getNrGrupa());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testConstructorSubLimita() {
		Grupa grupa = new Grupa (999);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testConstructorPesteLimita() {
		Grupa grupa = new Grupa (1110);
	}
	
	@Test(timeout=200)
	public void testConstructorPerformance() {
		Grupa grupa = new Grupa(1078);
	}
	
	@Test
	@Category({TesteGetPromovabilitate.class, TesteUrgente.class})
	public void testPromovabilitateRight() {
		Grupa grupa = new Grupa(1078);
		for (int i =0; i<8; i++) {
			Student student = new Student();
			student.adaugaNota(10);
			grupa.adaugaStudent(student);
		}
		for (int i =0; i<2; i++) {
			Student student = new Student();
			student.adaugaNota(4);
			grupa.adaugaStudent(student);
		}
		
		assertEquals(0.8, grupa.getPromovabilitate(), 0.001);
	}
	
	@Test
	@Category(TesteGetPromovabilitate.class)
	public void testGetPromovabilitateRight() {
		Grupa grupa = new Grupa(1078);
		for (int i =0; i<8; i++) {
			Student student = new Student();
			student.adaugaNota(10);
			grupa.adaugaStudent(student);
		}
		
		assertEquals(1, grupa.getPromovabilitate(), 0.001);
	}

	@Test
	@Category(TesteGetPromovabilitate.class)
	public void testGetPromovabilitateLeft() {
		Grupa grupa = new Grupa(1078);
		for (int i =0; i<8; i++) {
			Student student = new Student();
			student.adaugaNota(4);
			grupa.adaugaStudent(student);
		}
		
		assertEquals(0, grupa.getPromovabilitate(), 0.001);
	}
	
	@Test
	@Category(TesteGetPromovabilitate.class)
	public void testGetPromovabilitateInverse() {
		int nrIntegralisti = 31;
		int nrRestantieri = 2;
		Grupa grupa = new Grupa(1078);
		for (int i =0; i<nrIntegralisti; i++) {
			Student student = new Student();
			student.adaugaNota(10);
			grupa.adaugaStudent(student);
		}
		for (int i =0; i<nrRestantieri; i++) {
			Student student = new Student();
			student.adaugaNota(4);
			grupa.adaugaStudent(student);
		}
		
		assertEquals(nrIntegralisti, grupa.getPromovabilitate() * grupa.getStudenti().size(), 0.001);
	}
	
	@Test
	@Category(TesteGetPromovabilitate.class)
	public void testGetPromovabilitateError() {
		Grupa grupa = new Grupa(1078);
		
		assertEquals(0, grupa.getPromovabilitate(), 0.001);
	}
	
	@Test
	@Category(TesteGetPromovabilitate.class)
	public void testGetPromovabilitateCardinalityAreRestanta() {
		Grupa grupa = new Grupa(1078);
		Student student = new Student();
		student.adaugaNota(4);
		grupa.adaugaStudent(student);
		assertEquals(0, grupa.getPromovabilitate(), 0.001);
	}
	
	@Test
	@Category(TesteGetPromovabilitate.class)
	public void testGetPromovabilitateCardinalityNuAreRestanta() {
		Grupa grupa = new Grupa(1078);
		Student student = new Student();
		student.adaugaNota(8);
		grupa.adaugaStudent(student);
		assertEquals(1, grupa.getPromovabilitate(), 0.001);
	}
	
}
