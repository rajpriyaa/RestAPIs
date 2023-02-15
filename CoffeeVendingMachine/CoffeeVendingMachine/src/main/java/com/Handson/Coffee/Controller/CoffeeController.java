package com.Handson.Coffee.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.convert.ReadingConverter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.Handson.Coffee.Enitity.CoffeeCatalog;
import com.Handson.Coffee.Service.CoffeeService;

@ReadingConverter
public class CoffeeController {
	@Autowired
	private CoffeeService service;
	
	
	@GetMapping({"/dispense/{button}"})
	public CoffeeCatalog dispense(@PathVariable String button) {
        return this.service.makeProduct(button);
    }
}

	


