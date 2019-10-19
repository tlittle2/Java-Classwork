/**
 * 
 * @author Trevor Little
 * @version 2/22/19
 * This is the Driver class for Lab 5 about equals() and hashCode() methods.
 */
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person[] people= new Person[4];
		
		people[0]= new Person("Trevor", 19);
		people[1]= new UniversityMember("Bob", 23, "12345");
		people[2]= new Student("Blake", 19, "012501", 3.5);
		people[3]= new Professor("Bahls", 42, "190456", "213");
		
	
		
		for(Person i: people) {
			System.out.println(i);
		}
		
		System.out.println("______________");
		System.out.println();
		
		Person p1= new Person("Trevor", 19);
		Person p2= new Person("Trevor", 19);
		Person p3= new Person("Trevor", 20);
	
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		System.out.println(p3.hashCode());
	
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));
		
		System.out.println("______________");
		System.out.println();
		
		UniversityMember um1= new UniversityMember("bob", 23, "12345");
		UniversityMember um2= new UniversityMember("bob", 23, "12345");
		UniversityMember um3= new UniversityMember("bob", 23, "16345");
		
		System.out.println(um1.hashCode());
		System.out.println(um2.hashCode());
		System.out.println(um3.hashCode());
		
		System.out.println(um2.equals(um1));
		System.out.println(um2.equals(um3));
		
		System.out.println("______________");
		System.out.println();
		
		Student s1= new Student("Blake", 18, "012501", 4.0);
		Student s2= new Student("Blake", 18, "012501", 4.0);
		Student s3= new Student("Blake", 16, "012501", 4.0);
		
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
				
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		
		System.out.println("______________");
		System.out.println();
		
		Professor pro1= new Professor("Bahls", 42, "190456", "213");
		Professor pro2= new Professor("Bahls", 42, "190456", "213");
		Professor pro3= new Professor("Sheaffer", 42, "190456", "213");
		
		System.out.println(pro1.hashCode());
		System.out.println(pro2.hashCode());
		System.out.println(pro3.hashCode());
		
		System.out.println(pro2.equals(pro1));
		System.out.println(pro2.equals(pro3));
		
	}

}
