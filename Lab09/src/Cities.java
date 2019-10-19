/**
 * 
 * @author Trevor Little
 * @version 4/5/19
 * This is the Cities class for Lab09
 */

import java.util.ArrayList;

public class Cities {
	
	private ArrayList <City> a1;
	
	private int numberOfCities= 0;
	
	
	public Cities() {
		a1= new ArrayList<City>();
	}

	public void addCity(City city) {
		a1.add(city);
		numberOfCities++;
		
	}
	
	public int findPopulation(String nameOfCity) {
		for(int i= 0; i < a1.size(); i++) {
			if(a1.get(i).getNameOfCity().equals(nameOfCity)) { 
				return a1.get(i).getPopulation();
			
			}		
		}
		return -1;
	}
	
	public City biggestCity() {
		 City biggestCity= a1.get(0);		
		for(int i = 0; i < a1.size(); i++) {
			if(biggestCity.getPopulation() < a1.get(i).getPopulation()) {
					biggestCity= a1.get(i);	
			}
			
		}
		
		return biggestCity;
		
	}
	
	public int totalPopulation() {
		int totalPopulation= 0;
		for(int i = 0; i < a1.size(); i++) {
			totalPopulation+= a1.get(i).getPopulation();
		}
		
		return totalPopulation;
	}
	
	public int returnAveragePopulation() {
		return totalPopulation()/ numberOfCities;		

	}
	
	
	public ArrayList<City> returnWithinBounds(int lowerBound, int upperBound) {
		
		ArrayList<City>a1Copy= new ArrayList<City>();
		for(int i = lowerBound; i < upperBound; i++) {
				a1Copy.add(a1.get(i));
		}
		
		return a1Copy;
		
		
		
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((a1 == null) ? 0 : a1.hashCode());
		result = prime * result + numberOfCities;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cities other = (Cities) obj;
		if (a1 == null) {
			if (other.a1 != null)
				return false;
		} else if (!a1.equals(other.a1))
			return false;
		if (numberOfCities != other.numberOfCities)
			return false;
		return true;
	}

		
	@Override
	public String toString() {
		String temp = "";
		for(int i = 0; i < a1.size(); i++) {
			temp += a1.get(i)+ "\n";			
		}
		return  "Number of cities in list: " + numberOfCities +"\n"+ temp;
	}

	public static void main(String [] args) {
		
		Cities c1= new Cities();
		
		
			
		c1.addCity(new City("Chicago", 20));
		c1.addCity(new City("San Francisco", 30));
		c1.addCity(new City("Nashville", 50));
		c1.addCity(new City("Charleston", 40));
		c1.addCity(new City("Los Angeles", 100));
		
		
		
		
		Cities c2= new Cities();
		
		c2.addCity(new City("Chicago", 20));
		c2.addCity(new City("San Francisco", 30));
		c2.addCity(new City("Nashville", 50));
		c2.addCity(new City("Charleston", 40));
		c2.addCity(new City("Los Angeles", 100));
		
		
		assert c1.hashCode() == c2.hashCode(): "These two objects' hashcodes are not the same.";
		assert c1.equals(c2): "These two objects are equal.";
		
		assert c1.toString().equals("Number of cities in list: 5\n" +
				"The city of Chicago has a population of 20 people\n" +
				"The city of San Francisco has a population of 30 people\n" +
				"The city of Nashville has a population of 50 people\n" +
				"The city of Charleston has a population of 40 people\n" +
				"The city of Los Angeles has a population of 100 people\n"): "toString is not what was expected";
				
		
		
		c1.findPopulation("Charleston");
		assert c1.findPopulation("Charleston") == 40: "Expected 40, got " + c1.findPopulation("Charleston");
			
		
		assert c1.biggestCity().getPopulation()== 100: "Expected 100, got " + c1.biggestCity().getPopulation();

	
		assert c1.returnWithinBounds(2,4).get(1).getPopulation() == 40: "Expected 40 at new index 2, got " + c1.returnWithinBounds(2,4).get(1).getPopulation();
			
		
		assert c1.returnAveragePopulation()== 48: "Expected 48, got " + c1.returnAveragePopulation();
			
		
		assert c1.totalPopulation()== 240: "Expected 240, got " + c1.totalPopulation();
			
	}
		
	
	
}
	
	
	
	

