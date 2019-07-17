package com.dto;

import com.interfaces.IAlien;
import com.telusko.demorest.Alien;

/*
 * Acceso a base de datos
 * */
public class AlienDAO implements IAlien {

	@Override
	public Alien getAlien() {
		return new Alien();
	}

	@Override
	public Alien getAlien(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}