package com.Handson.Movies.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="movies")

public class MovieCatalog {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private float price;
	private String genre;
	public int getId() {

		return id;
	}
	public void setId(int id) {

		this.id = id;
	}
	public String getName() {

		return name;
	}
	public void setName(String name) {

		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	
	
	public MovieCatalog(String name, String genre , float price) {
		super();
		//this.id = id;
		this.name = name;
		this.price = price;
		this.genre = genre;
	}
	
	
	public MovieCatalog() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String toString() {
		return "MovieCatalog [id=" + id + ", name=" + name + ", price=" + price + ", genre=" + genre + "]";
	}
	
	
	
	
}