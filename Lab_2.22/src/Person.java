/**
 * 
 * @author Trevor Little
 * @version 2/22/19
 * This is the Person class. It is the top of the heirarchy. 
 */
public class Person {
	protected String name;
	protected int age;
	
	public Person(String name, int age) {
		this.name= name;
		this.age= age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int hashCode() {
		int hash= 7;
		hash= 23 * hash + name.hashCode(); //do it this way because its a string.
		hash= 23 * hash + age; //do it this way because its an int
		
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
		Person p = (Person) obj;
		return name.equals(p.name) && age == p.age;
	}

	@Override
	public String toString() {
		return "Name: " + name + " Age: " + age;
	}
	
	
	

}
