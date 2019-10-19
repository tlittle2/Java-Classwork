/**
 * 
 * @author Trevor Little
 * @version 2/25/19
 * This class defines what it means to be a Print medium, a type of non-electronic medium. 
 */
public class Print extends Medium {

	private int numberOfPages;
	
public Print(String title, String creator, int year, int numberOfPages) {
		super(title, creator, year);
		this.numberOfPages= numberOfPages;
		// TODO Auto-generated constructor stub
	}

/**
 * 	
 * @return numberOfPages returns the number of pages in the print medium.
 */
	public int getNumberOfPages() {
		return numberOfPages;
	}

/**
 * 
 * @param numberOfPages sets the numberOfPages to whatever is inside of the method's constructor.
 */
	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
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
		hash= 23 * hash + numberOfPages;;
		
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
		Print p = (Print) obj;
		if (!super.equals(p))
			return false;
		return numberOfPages == p.numberOfPages;
	}

	/**
	 * returns a string representation of the object. Implements Medium's toString method.
	 */
	@Override
	public String toString() {
		return super.toString() + ". It is " + numberOfPages + " pages long.";
	}
	
}
