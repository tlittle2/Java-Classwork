/**
 * 
 * @author Trevor Little
 * @version 2/25/19
 * This is the TimedMedium class that defines any electronic type media and what should be a part of it.
 */
public abstract class TimedMedium extends Medium {
	protected int duration;
	
	
public TimedMedium(String title, String creator, int year, int duration) {
		super(title, creator, year);
		this.duration= duration;
		
	}

/**
 * 	
 * @return duration returns the length of time of the electronic media
 */
	public int getDuration() {
		return duration;
	}

/**
 * 
 * @param duration sets the duration of the electronic media to whatever is specified within the methods
 * constructor
 */
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	/**
	 * returns the equality of 2 objects
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if(obj == null)
			return false;
		if(getClass()!= obj.getClass())
			return false;
		TimedMedium tm= (TimedMedium) obj;
		if(!super.equals(tm))
			return false;
		return duration == tm.duration;
	}
	
	/**
	 * Returns the hashcode of the object
	 */
	@Override
	public int hashCode() {
		int hash= 7;
		hash= 23 * hash + title.hashCode();
		hash= 23 * hash + creator.hashCode();
		hash= 23 * hash + year;
		hash= 23 * hash + duration;
		
		return hash;
	}
	
	/**
	 * returns a string representation of the object. Implements Medium's toString method.
	 */
	@Override
	public String toString() {
		return super.toString() + " and lasts " + duration + " minutes.";
	}
	
}
