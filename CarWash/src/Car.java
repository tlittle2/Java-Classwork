/**
 * @author Trevor Little
 * @version 3/31/19
 * This is the Car class that defines what it means to be a Car object.
 */
public class Car {
	private CarWashOption washOption;
	private int timeRemaining;
	
	/**
	 * 
	 * @param washOption represents the car wash option chosen.
	 */
	public Car(CarWashOption washOption) {
		this.washOption= washOption;
		timeRemaining= washOption.getDuration();
	}

	/**
	 * 
	 * @return washOption- returns the CarWashOption the user chooses.
	 */
	public CarWashOption getWashOption() {
		return washOption;
	}

	/**
	 * 
	 * @param washOption sets a CarWashOption when a new Car is set.
	 */
	public void setNewCar(CarWashOption washOption) {
		this.washOption = washOption;
	}
	
	/**
	 * 
	 * @return timeRemaining- returns the timeRemaining in the wash cycle.
	 */
	public int getTimeRemaining() {
		return timeRemaining;
	}
	
	/**
	 * 
	 * @param timeRemaining- sets the timeRemaining to a user input number.
	 */
	public void setTimeRemaining(int timeRemaining) {
		this.timeRemaining = timeRemaining;
	}

	
	public void decrementTime() {		
		if(timeRemaining > 0){ 
			timeRemaining--;
		}
		
	}
	
}
