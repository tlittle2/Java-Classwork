/**
 * @author Trevor Little
 * @version 3/31/19
 * This is the CarWashOption enum that defines the instances for the types of car washes and how to get random options.
 */
import java.util.Random;

public enum CarWashOption {
	BASIC(2, 5.00),
	STANDARD(3, 7.00),
	WASHANDWAX(5, 15.00),
	SELFSERVICE(6, 9.00),
	THOROUGH(10, 18.00);
	
	
	private static CarWashOption[] vals = values();
	private static Random gen = new Random();

	
	private final int duration;
	private final double price;
	
	/**
	 * 
	 * @param duration- represents the amount of time it takes to go through a car wash
	 * @param price- represents the price of a car wash
	 */
	CarWashOption(int duration, double price) {
		this.duration= duration;
		this.price= price;
	}
	
	/**
	 * 
	 * @return duration- the amount of time it takes to get through the car wash
	 */
	public int getDuration() {
		return duration;
	}
	
	/**
	 * 
	 * @return price- returns the price of a car wash
	 */
	public double getPrice() {
		return price;
	}
	
	/**
	 * 
	 * @return a random car wash option
	 */
	public static CarWashOption getRandomOption() {
		
		return vals[(gen.nextInt(vals.length))];
		}

	
	

}
