/**
 * 
 * @author Trevor Little
 * @version 2/25/19
 * This is the Audio that defines a specific type of TimedMedium (audio type).
 */
public class Audio extends TimedMedium  {
	
	private int decibelLevel;

	public Audio(String title, String creator, int year, int duration, int decibelLevel) {
		super(title, creator, year, duration);
		this.decibelLevel= decibelLevel;
		
		
	}
	
	/**
	 * 
	 * @return the value of decibelLevel.
	 */
	public int getDecibelLevel() {
		return decibelLevel;
	}
	
	/**
	 * 
	 * @param sets decibelLevel to whatever is specified in the constructor.
	 */
	public void setDecibelLevel(int decibelLevel) {
		this.decibelLevel = decibelLevel;
	}
	
	/**
	 * Returns the hashcode of the object
	 */
	@Override
	public int hashCode() {
		int hash = 7;
		
		hash= 23 * hash + title.hashCode();
		hash= 23 * hash + creator.hashCode();
		hash= 23 * hash + year;
		hash= 23 * hash + duration;
		hash= 23 * hash + decibelLevel;
		
		return hash;
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
		if (getClass() != obj.getClass())
			return false;
		Audio a = (Audio) obj;
			if(!super.equals(a))
			return false;
		return decibelLevel == a.decibelLevel;
	}

	/**
	 * returns a string representation of the object. Implements Medium's toString method.
	 */
	@Override
	public String toString() {
		return super.toString() + "" + " It's decibel level is " + decibelLevel + "dbz.";
	}


}
