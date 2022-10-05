package com.example.demo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional  //(to begin and close the transaction)
public class PlacementService {

	//Achieving DI as we are not using beans.xml so we have to create object
	@Autowired
	private PlacementRepository repo;
	
	//to retrieve all the data of student class
	public List<Placement> listAll()
	{
		return repo.findAll();
	}
	//insert/create/update a data
	public void create(Placement p)
	{
		 repo.save(p);
	}
	//to retrieve a single record
	public Placement retrieve(Integer id)
	{
		return repo.findById(id).get();
		
	}
	//to delete a data
	public void delete(Integer id)
	{
		repo.deleteById(id);
	}

}
