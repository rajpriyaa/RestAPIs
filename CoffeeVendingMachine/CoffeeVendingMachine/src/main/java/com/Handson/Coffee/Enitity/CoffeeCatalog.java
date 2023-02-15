package com.Handson.Coffee.Enitity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;


public class CoffeeCatalog {
	private int coffeeInGrams;
	private int teapowder;
	private int steam;
	private Float milk;
	private Float water;
	public int getCoffeeInGrams() {
		return coffeeInGrams;
	}
	public void setCoffeeInGrams(int coffeeInGrams) {
		this.coffeeInGrams = coffeeInGrams;
	}
	public int getTeapowder() {
		return teapowder;
	}
	public void setTeapowder(int teapowder) {
		this.teapowder = teapowder;
	}
	public int getSteam() {
		return steam;
	}
	public void setSteam(int steam) {
		this.steam = steam;
	}
	public Float getMilk() {
		return milk;
	}
	public void setMilk(Float milk) {
		this.milk = milk;
	}
	public Float getWater() {
		return water;
	}
	public void setWater(Float water) {
		this.water = water;
	}
	
	
	
	public CoffeeCatalog(int coffeeInGrams, int teapowder, int steam, Float milk, Float water) {
		super();
		this.coffeeInGrams = coffeeInGrams;
		this.teapowder = teapowder;
		this.steam = steam;
		this.milk = milk;
		this.water = water;
	}
	
	
	public CoffeeCatalog() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String toString() {
		return "CoffeeCatalog [coffeeInGrams=" + coffeeInGrams + ", teapowder=" + teapowder + ", steam=" + steam
				+ ", milk=" + milk + ", water=" + water + "]";
	}
	
	
	

}
