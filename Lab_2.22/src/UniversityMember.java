/**
 * 
 * @author Trevor Little
 * @version 2/22/19
 * This class defines what it means to be a UniversityMember, which is a type of Person.
 */

public class UniversityMember extends Person {
	protected String idNumber;

	public UniversityMember(String name, int age, String idNumber) {	
		super(name, age);
		this.idNumber= idNumber;
	}

	public String getIdentificationNumber() {
		return idNumber;
	}

	public void setIdentificationNumber(String identificationNumber) {
		this.idNumber = identificationNumber;
	}

	@Override
	public int hashCode() {
		int hash= 7;
		
		hash= 23 * hash + name.hashCode();
		hash= 23 * hash + age;
		hash= 23 * hash * idNumber.hashCode();
		
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj== null)
			return false;
		if(getClass() != obj.getClass())
			return false;
		UniversityMember um= (UniversityMember) obj;
		if(!super.equals(um))
			return false;
		
		return idNumber.equals(um.idNumber);
	}

	@Override
	public String toString() {
		return super.toString() + " ID: " + idNumber;
	}
	
	
	
	
}
