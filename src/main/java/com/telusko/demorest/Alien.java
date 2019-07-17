package com.telusko.demorest;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Alien {

	private int id;
	private String name;
	private int points;
	
	public Alien() {}
	
	public Alien(ResultSet rs) throws SQLException {
		setId(rs.getInt("id"));
		setName(rs.getString("name"));
		setPoints(rs.getInt("points"));
	}
	
	public Alien(int id, String name, int points){
		setId(id);
		setName(name);
		setPoints(points);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Alien [id=" + id + ", name=" + name + ", points=" + points + "]";
	}
	
	
	
}
