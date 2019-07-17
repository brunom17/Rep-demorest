package com.test;

import com.interfaces.IAlien;
import com.telusko.demorest.Alien;

/*
 * TODO: Simular acceso a base de datos
 * */
public class testDAO implements IAlien{

	@Override
	public Alien getAlien() {
		Alien alien = new Alien(0, "name", 0); 
		return alien;
	}

	@Override
	public Alien getAlien(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
