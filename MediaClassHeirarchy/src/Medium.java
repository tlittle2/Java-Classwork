/**
 * 
 * @author Trevor Little
 * @version 2/25/19
 * This is is the Medium class that defines what it means to be a type of medium. 
 * This is the top of the heirarchy, which means that every class it extends has these methods inherently 
 * within them.
 */

public abstract class Medium {

	protected String title;
	protected String creator;
	protected int year;
	
	public Medium(String title, String creator, int year) {
		this.title= title;
		this.creator= creator;
		this.year= year;
	}

/**
 * 	
 * @return returns the title of the medium
 */
	public String getTitle() {
		return title;
	}

/**
 * 	
 * @param sets the title to what is inside of the method's constructor when called.
 */
	public void setTitle(String title) {
		this.title = title;
	}

/**
 * 	
 * @return returns the creator of the medium
 */
	public String getCreator() {
		return creator;
	}

/**
 * 	
 * @param creator sets the creator name to what is in the method's constructor when called.
 */
	public void setCreator(String creator) {
		this.creator = creator;
	}
	
/**
 * 	
 * @return returns the year of publication for medium
 */
	public int getYear() {
		return year;
	}
	
/**
 * 	
 * @param year sets the year to what is in the method's constructor when called
 */
	public void setYear(int year) {
		this.year = year;
	}
	
	/**
	 * Returns the hashcode of the object
	 */
	
	@Override
	public int hashCode() {
		int hash= 7;
		
		hash = 23 * hash + title.hashCode();
		hash = 23 * hash + creator.hashCode();
		hash= 23 * hash + year;
		
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
		Medium m = (Medium) obj;
		return title.equals(m.title) && creator.equals(m.creator) && year == m.year;
	}
	
	/**
	 * returns a string representation of the object
	 */
	@Override
	public String toString() {
		return title + " was created in " + year + " by " + creator;
	}
	
}
