package CountryViev;

import java.util.ArrayList;
import java.util.List;

import country.entity.*;

import country.logic.CountryLogic;
public class View {
	CountryLogic i = new CountryLogic();
	
	public void printNumberOfAreas(ListOfCountry a) {
		
		System.out.println("Number of areas: "+i.numberOfAreas(a));
	}
	
	public void printSurfaceOfArea(ListOfCountry a) {
		
		System.out.println("Surface area of the country is: " + i.getCountryArea(a));
	}
	
	public void printMainCity(ListOfCountry a, String e) {
		System.out.println("Main city is: " + i.findMainCity(a, e));
	}
	
	public void printAreas(ListOfCountry a) {
		
		List<City> list = new  ArrayList<City>();
		list = a.getList();
		System.out.println("List of cities: ");
		for (int i = 0 ; i < list.size(); i++ ) {
			if (list.get(i) instanceof Country)
			System.out.print(list.get(i).getCityname());
			System.out.print(" ");
		}
		
	}
}
