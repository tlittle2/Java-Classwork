//Trevor Little
public class MovieMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Movie Movie1= new Movie("Indiana Jones", "Stephen Speilberg", 1981, 140);
		
		Movie Movie2= new Movie("Star Wars Episode IV", "George Lucas", 1979, 150);
		
		Movie Movie3= new Movie("Transformers", "Michael Bay", 2007, 190);
		
		System.out.println(Movie1);
		System.out.println(Movie2);
		System.out.println(Movie3);
		
		Movie1.setName("Gumanji");
		
		System.out.println();
		
		System.out.println(Movie1);
	}

}
