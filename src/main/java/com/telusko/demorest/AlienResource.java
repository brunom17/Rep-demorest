package com.telusko.demorest;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.dto.AlienDAO;
import com.interfaces.IAlien;


@Path("aliens")
public class AlienResource {
	
	AlienRepository repo = new AlienRepository();

	@GET
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public ArrayList<Alien> getAliens() throws SQLException {
		System.out.println("getAlien call");
		
		return repo.getAliens();
	}
	
	@GET
	@Path("alien/{id}")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Alien getAlien(@PathParam("id") int id) {
		IAlien ialien = new AlienDAO();
		
		System.out.println("getAlien: " + ialien.getAlien(id));
		
		return repo.getAlien(id);
		
	}
	
	@POST
	@Path("alien")
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Alien createAlien(Alien a1) {
		
		System.out.println("getAlien create");
		repo.create(a1);
		System.out.println(a1);
		
		return a1;
	}
	
	@PUT
	@Path("alien")
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Alien updateAlien(Alien a1) {
		
		System.out.println("getAlien update");
		if(repo.getAlien(a1.getId()).getId() == 0) {
			repo.create(a1);
		}else {
		repo.update(a1);
		}
		System.out.println(a1);
		
		return a1;
	}
	
	@DELETE
	@Path("alien/{id}")
	public Alien deleteAlien(@PathParam("id") int id) 
	{
		Alien a = repo.getAlien(id);
		
		if(a.getId() == id) {
			System.out.println("getAlien update");
			repo.delete(id);
		}
		else {
			System.out.println("Alien doesnt exists");
		}
		return a;
	}
	
}
