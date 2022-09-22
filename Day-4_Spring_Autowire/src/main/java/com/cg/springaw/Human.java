package com.cg.springaw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
	//dependency in term of object
	private Heart heart;
	
	//achieving DI using setters
	@Autowired
	@Qualifier("Humanheart")
	public void setHeart(Heart heart) {
		this.heart = heart;
	}
	
	//using constructor in beans instead of byName write constructor
	public Human(Heart heart) {
		super();
		this.heart = heart;
	}
	
	public Human() {
		this.heart=heart;
	}

	public void pumping()
	{
		heart.pump();
		System.out.println("Name of the animal is: "+heart.getNameOfAnimal()+" "+"No of heart is: "+heart.getNoOfHeart());
	}
}
