
public class Driver {

	public Driver() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		superCollection s= new superCollection();
		
		s.makeSet(1);
		System.out.println(s);
		
		s.makeSet(2);
		System.out.println(s);
		
		s.makeSet(3);
		System.out.println(s);
		
		s.union(1,2);
		System.out.println(s);
	}

}
