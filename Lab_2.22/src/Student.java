/**
 * 
 * @author Trevor Little
 * @version 2/22/19
 * This class defines what it means to be a Student, which is a type of UniversityMember, 
 * which is also a type of Person.
 */

public class Student extends UniversityMember {
	private double gpa;
	
	public Student(String name, int age, String idNumber, double gpa) {
		super(name, age, idNumber);
		this.gpa= gpa;
	}

	public double getGPA() {
		return gpa;
	}

	public void setGPA(double gPA) {
		gpa = gPA;
	}

	@Override
	public int hashCode() {
		int hash= 7;
		
		hash= 23 * hash + name.hashCode();
		hash= 23 * hash + age;
		hash= 23 * hash + idNumber.hashCode();
		hash= 23 * hash + Double.valueOf(gpa).hashCode();
		
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student s = (Student) obj;
		if (!super.equals(s))
			return false;
		return gpa == s.gpa;
	}

	@Override
	public String toString() {
		return super.toString() + " GPA: " + gpa;
	}
	
	
}
