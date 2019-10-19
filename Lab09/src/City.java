/**
 * 
 * @author Trevor Little
 * @version 4/5/19
 * This is the City class for Lab09
 */
public class City {
	private String nameOfCity;
	private int population;
	
	
	public City(String nameOfCity, int population) {
		this.nameOfCity= nameOfCity;
		this.population= population;
	}
	
	
	
	
	public String getNameOfCity() {
		return nameOfCity;
	}


	public void setNameOfCity(String nameOfCity) {
		this.nameOfCity = nameOfCity;
	}


	public int getPopulation() {
		return population;
	}


	public void setPopulation(int population) {
		this.population = population;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nameOfCity == null) ? 0 : nameOfCity.hashCode());
		result = prime * result + population;
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
		City other = (City) obj;
		if (nameOfCity == null) {
			if (other.nameOfCity != null)
				return false;
		} else if (!nameOfCity.equals(other.nameOfCity))
			return false;
		if (population != other.population)
			return false;
		return true;
	}




	@Override
	public String toString() {
		return "The city of " + nameOfCity + " has a population of " + population + " people";
	}

	
	



	public static void main(String[] args) {
		City c1= new City("Charlotte", 100000);
		City c2= new City("Charlotte", 100000);
		
		assert c1.getNameOfCity().equals("Charlotte"): "Expected Charlotte, got" + c1.getNameOfCity();
		assert c1.getPopulation() == 100000: "Expected 100000, got " + c1.getPopulation();
		
		
		
		assert c1.hashCode() == c2.hashCode(): "Hashcodes are not the same.";
		
		assert c1.equals(c2): "These objects are not the same.";
				
		assert c1.toString().equals("The city of Charlotte has a population of 100000 people"): "The strings you are trying to compare are not the same.";
		
	}

}
