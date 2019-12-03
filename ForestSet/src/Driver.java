
public class Driver {

	public Driver() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Forest f= new Forest();
		
		f.makeSet(1);
		f.makeSet(2);
		f.makeSet(3);
		f.makeSet(4);
		f.makeSet(5);
		f.makeSet(6);
		System.out.println(f);
		
		
		System.out.println(f.findSet(1).getMember());
		System.out.println(f.findSet(2).getMember());
		System.out.println(f.findSet(6).getMember());
		
		System.out.println();
		
		System.out.println("Unions");
		System.out.println("------");
		f.union(1,2);
		System.out.println(f);
		System.out.println(f.findSet(2).getMember());
			
		f.union(2, 3);
		System.out.println(f);
		System.out.println(f.findSet(3).getMember());
		
		f.union(4,5);
		System.out.println(f);
		System.out.println(f.findSet(4).getMember());
		
		System.out.println(f.findSet(3).getMember());
		f.union(1, 6);
		System.out.println(f);
	

	}

}
