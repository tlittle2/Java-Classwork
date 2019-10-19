/**
 * @author Trevor Little
 * @version 3/31/19
 * This is the CarWash class that defines what the simulation does.
 */
import java.text.NumberFormat;
import java.util.ArrayDeque;
import java.util.Random;

public class CarWash{

private static Random gen = new Random();
	
	private int iterations;
	
	private int steps;
	
	private int numberOfBays;
	
	private double probability;
	
	private int maxLengthofQueue;
	
	private int numberOfCarsLeft;
	
	private int numberOfCarsWashed;
	
	private double totalRevenue;
	
		
	ArrayDeque <Car> carsWaiting= new ArrayDeque<Car>();
	ArrayDeque <Car> carsBeingWashed= new ArrayDeque<Car>(numberOfBays);
	ArrayDeque <Car> carsToBeRemoved= new ArrayDeque<Car>(numberOfBays);
	
	/**
	 * 
	 * @param numberOfBays represents the number of car wash bays that will be present during the simulation.
	 */
	public CarWash(int numberOfBays) {
		this.numberOfBays= numberOfBays;
		
	}
	
	/**
	 * 	
	 * @param steps- represents the number of steps of the simulation.
	 * @param probability- represents the probability that a car will arrive at a car wash.
	 */
	public void run(int stepsin, double probability) {
		CarWashOption wash1;
		steps= stepsin;
		this.probability= probability;
		for (int i= 1; i < steps + 1; i++) {
			if(gen.nextDouble() < probability) {
				wash1= CarWashOption.getRandomOption();
				carsWaiting.add(new Car(wash1));
				if(carsWaiting.size() > maxLengthofQueue) {
					maxLengthofQueue++;
				}			
				
				numberOfCarsLeft++;
							
			}
			if(carsBeingWashed.size() < this.numberOfBays && !carsWaiting.isEmpty()){
				totalRevenue+= carsWaiting.peek().getWashOption().getPrice();
				carsBeingWashed.add(carsWaiting.pop());
				numberOfCarsLeft--;
					
											
			}
			
			for(Car j: carsBeingWashed) {
				j.decrementTime();
				
				if(j.getTimeRemaining() == 0) {
					carsToBeRemoved.add(j);
					numberOfCarsWashed++;
					
				}
				
			}
			
			for(Car k: carsToBeRemoved) {
				carsBeingWashed.remove(k);
				
			}
			carsToBeRemoved.clear();
			iterations = i;
			
						
			printData();
			
			
		}
	}
	public void printData() {
		System.out.println("Number of Steps: " + iterations);
		System.out.println("Number of Bays: " + numberOfBays);
		System.out.println("Car Arrival Probability: " + probability);
		System.out.println("Maximum Length of Car Wash Queue: " + maxLengthofQueue);
		System.out.println("Number of Cars Left: " + numberOfCarsLeft);
		System.out.println("Total Number of Cars Washed: " + numberOfCarsWashed);
		NumberFormat Dollar= NumberFormat.getCurrencyInstance();
		System.out.println("Total Revenue: " + Dollar.format(totalRevenue));
		
		System.out.println();
	}
	
	
	

}
