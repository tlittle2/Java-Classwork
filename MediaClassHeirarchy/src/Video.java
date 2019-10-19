/**
 * 
 * @author Trevor Little
 * @version 2/25/19
 * This is the video class that defines what it means to be this type of TimedMedium 
 */
public class Video extends TimedMedium {
	private double resolution;
	
	
	

public Video(String title, String creator, int year, int duration, double resolution) {
		super(title, creator, year, duration);
		this.resolution= resolution;
	}

/**
 * 	
 * @return resolution returns the number of pixels displayed on the video
 */
	public double getResolution() {
		return resolution;
	}

/**
 * 
 * @param resolution sets the resolution to whatever is in the method's constructor. 
 */
	public void setResolution(double resolution) {
		this.resolution = resolution;
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
		hash= 23 * hash + Double.valueOf(resolution).hashCode();
		
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
		Video v = (Video) obj;
		if (!super.equals(v))
			return false;
		return resolution == v.resolution;
	}
	
	/**
	 * returns a string representation of the object. Implements TimedMedium's toString method.
	 */
	@Override
	public String toString() {
		return super.toString() + " " + "It's resolution is " + resolution + " pixels.";
	}
	
}
