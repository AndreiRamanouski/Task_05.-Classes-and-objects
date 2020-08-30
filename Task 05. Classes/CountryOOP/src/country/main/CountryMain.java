package country.main;

import CountryViev.View;
import country.entity.*;
import country.logic.CountryLogic;

public class CountryMain {

	public static void main(String[] args) {
		ListOfCountry list  = new ListOfCountry();
		View view = new  View();
		City brest = new City("Brest Area",32000, "Brest district", "Brest");
		City grodno = new City("Grodno Area", 25000, "Grodno district", "Grodno");
		City vietebsk = new City("Vietebsk Area", 40000, "Vietebsk district", "Vietebsk");
		City magilev = new City("Magilev Area", 29000, "Magilev district", "Magilev");
		City gomel = new City("Gomel Area", 40000, "Gomel district", "Gomel");
		City minsk = new City("Minsk Area", 39000, "Minsk district", "Minsk");
		
		String mainCity = "Minsk";
		
		list.add(brest);
		list.add(grodno);
		list.add(vietebsk);
		list.add(magilev);
		list.add(gomel);
		list.add(minsk);
		
		view.printNumberOfAreas(list);
		view.printSurfaceOfArea(list);
		view.printMainCity(list, mainCity);
		view.printAreas(list);
	}

	
	
	
} 
