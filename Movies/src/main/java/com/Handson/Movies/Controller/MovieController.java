package com.Handson.Movies.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Handson.Movies.Entity.MovieCatalog;
import com.Handson.Movies.Service.MovieService;



@RestController
public class MovieController {
	@Autowired
	private MovieService service;

	
	
	@PostMapping("/addmovies")
	public List<MovieCatalog> saveAllMovies(){
		List<MovieCatalog> M1 =new ArrayList();
        M1.add(new MovieCatalog("Avatar", "SciFi", 600.00F));
        M1.add(new MovieCatalog("Suryavanshi", "Rubbish", 399.99F));
        M1.add(new MovieCatalog("Phir hera pheri", "Comedy", 200.50F));
        M1.add(new MovieCatalog("KGF", "Action Drama", 239.99F));
        M1.add(new MovieCatalog ("21st century girl", "don't know", 450.0F));
        M1.add(new MovieCatalog("Pathan", "Action", 100.50F));
        M1.add(new MovieCatalog("RRR", "action-drama", 800.0F));

        return this.service.saveall(M1);
	}

	
	@GetMapping("/moviesList")
    public List<MovieCatalog> getallmovies() {
        return this.service.getall();
    }
    
	
	@PostMapping("/rentmovie/{id}")
	public String rentmovie(@PathVariable int id) {
		return "movie renting done";
	
	
	
	}
	
	
}
