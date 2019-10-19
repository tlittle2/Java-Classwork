/**
 * 
 * @author Trevor Little
 * @version 2/25/19
 * This class shows the amount of time in hours, minutes, and seconds, as well provides a way of seeing the
 * time in just seconds. 
 */
public class Time {
	
	private int hours;
	private int minutes;
	private int seconds;
	
	private int totalInSeconds;
	
	public Time(int hours, int minutes, int seconds) {
		this.hours= hours;
		this.minutes= minutes;
		this.seconds= seconds;
				
	}

/**
 * 	
 * @return the amount of hours
 */
	public int getHours() {
		return hours;
	}

/**
 * 
 * @return the amount of minutes
 */
	public int getMinutes() {
		return minutes;
	}

/**
 * 
 * @return the amount of seconds
 */
	public int getSeconds() {
		return seconds;
	}

/**
 * 	
 * @return the total duration in seconds.
 */
	public int getTotalInSeconds() {
		totalInSeconds= ((hours * 3600) + (minutes * 60) + seconds);
		return totalInSeconds;
	}

	/**
	 * Returns the hashcode of the object
	 */
	@Override
	public int hashCode() {
		int hash = 7;
		 
		hash= 23 * hash + hours;
		hash= 23 * hash + minutes;
		hash= 23 * hash + seconds;
		hash= 23 * hash + totalInSeconds;
		
		return hash;
	}

	/**
	 * returns the equality of 2 objects
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time t= (Time) obj;
			return t.hours == (hours) && t.minutes == minutes && t.seconds == seconds && t.totalInSeconds == totalInSeconds;
	}

	/**
	 * returns a string representation of the object.
	 */
	@Override
	public String toString() {
		return hours + " hours " +  minutes + " minutes " + seconds + " seconds" ;
	}

	
}
