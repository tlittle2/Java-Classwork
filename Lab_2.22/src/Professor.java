/**
 * 
 * @author Trevor Little
 * @version 2/22/19
 * This class defines what it means to be a Professor, which is a type of UniversityMember, 
 * which is also a type of Person.
 */

public class Professor extends UniversityMember {
	private String officeLocation;
	
	public Professor(String name, int age, String idNumber, String officeLocation) {
		super(name, age, idNumber);
		this.officeLocation= officeLocation;
	
	}

	public String getOfficeLocation() {
		return officeLocation;
	}

	public void setOfficeLocation(String officeLocation) {
		this.officeLocation = officeLocation;
	}

	@Override
	public int hashCode() {
		int hash= 7;
		
		hash= 23 * hash + name.hashCode();
		hash= 23 * hash + age;
		hash= 23 * hash + idNumber.hashCode();
		hash= 23 * hash + officeLocation.hashCode();
		
		return hash;
		
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if(obj == null)
			return false;
		if(getClass() != obj.getClass())
			return false;
		
		Professor p= (Professor) obj;
		if(!super.equals(p))
			return false;
		return officeLocation.equals(p.officeLocation);
		
	}

	@Override
	public String toString() {
		return super.toString() + " Office Location: " + officeLocation;
	}
	
	

}
