/**
 * @author Trevor Little
 * @version 3/31/19
 * This is the CarWashManager class that runs the simulation.
 */
public class CarWashManager {

	public static void main(String[] args) {
		CarWash w1= new CarWash(5);
		
		w1= new CarWash(5);
		w1.run(10, 0.50);
		
		System.out.println("----------------------");
		System.out.println();
		
		w1= new CarWash(5);
		w1.run(50, 0.10);
		
		System.out.println("----------------------");
		System.out.println();
		
		w1= new CarWash(5);
		w1.run(300, 0.75);

	}

}
 