package com.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.dto.AlienDAO;
import com.interfaces.IAlien;
import com.telusko.demorest.Alien;
import com.telusko.demorest.MyResource;

public class MyResourceTest {

	@Test
	public void test() {
		System.out.println("test");
		String test;
		MyResource MR = new MyResource();
		
		test = MR.getIt();
		
		assertEquals("Got it!",test);
	}
	
	@Test
	public void testAlien() {
		System.out.println("testAlien");
		
		Alien alien = new Alien();
		alien.setId(0);
		alien.setName("nombre");
		alien.setPoints(0);
		
		assertEquals("Alien [id=0, name=nombre, points=0]", alien.toString());
	}
	
	@Test
	public void testAlienconstructor() {
		System.out.println("testAlienconstructor");
		
		Alien alien = new Alien(0, "nombre", 0);
		
		Alien alienset = new Alien();
		alienset.setId(0);
		alienset.setName("nombre");
		alienset.setPoints(0);
		
		assertEquals(alien.toString(), alienset.toString());		
	}
	
	@Test
	public void testIAlien() {
		IAlien ialientest = new testDAO();
		IAlien ialiendao = new AlienDAO();
		Alien alien = new Alien(0, "name", 0);
		
		System.out.println(ialientest.getAlien().toString());
		System.out.println(ialiendao.getAlien().toString());
		
		assertEquals(ialientest.getAlien().toString(),alien.toString());
	}

}
