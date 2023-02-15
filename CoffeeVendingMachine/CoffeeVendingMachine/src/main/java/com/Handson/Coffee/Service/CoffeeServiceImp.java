package com.Handson.Coffee.Service;
import org.springframework.stereotype.Service;

import com.Handson.Coffee.Enitity.CoffeeCatalog;

import jakarta.transaction.Transactional;
@Service
//@Transactional
public class CoffeeServiceImp implements CoffeeService {

	@Override
	public CoffeeCatalog makeProduct(String product) {
		// TODO Auto-generated method stub
        CoffeeCatalog i = null;
        switch (product) {
            case "espresso":
                i = new CoffeeCatalog(15, 0, 30, 0.3F, 0.03F);
                return i;
            case "cappacino":
                i = new CoffeeCatalog(20, 0, 20, 0.1F, 0.02F);
                return i;
            case "Tea":
                i = new CoffeeCatalog(0, 20, 30, 0.3F, 0.01F);
                return i;
           
            case "milk":
                i = new CoffeeCatalog(0, 0, 30, 0.2F, 0.05F);
                return i;
            case "latte":
                i = new CoffeeCatalog(20, 0, 35, 0.2F, 0.02F);
                return i;
            case "steam":
                i = new CoffeeCatalog(0, 0, 10, 0.0F, 0.02F);
                return i;
            case "water":
                i = new CoffeeCatalog(0, 0, 5, 0.0F, 0.25F);
                return i;
        }
        i=new CoffeeCatalog(0, 0, 0, 0.0F, 0.0F);
        
		
		return i;
	}

}
