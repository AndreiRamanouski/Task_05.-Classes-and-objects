package country.logic;

import java.util.ArrayList;
import java.util.List;

import country.entity.*;

public class CountryLogic {
	private List<City> list = new  ArrayList<City>();
	
	public int numberOfAreas(ListOfCountry a) {
		list = a.getList();
		int number = 0;
		for(int i = 0 ; i < list.size(); i++) {
			if (list.get(i) instanceof Country ) {
				number++;
			}
		}
		return number;
	}
	
	
	public int getCountryArea(ListOfCountry a) {
		list = a.getList();
		int area = 0;
		for( int i = 0 ; i < list.size(); i ++) {
			area += list.get(i).getSurfacearea();
		}
		return area;
	}
	
	public String findMainCity(ListOfCountry a, String e) {
		list = a.getList();
		for (int i = 0 ; i < list.size(); i++) {
			if (e.equals(list.get(i).getCityname())){
				return e;
			}
		}
		return "Set new Main City";
	}
	
	
}
