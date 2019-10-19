/**
 * 
 * @author Trevor Little
 * @version 4/29/19
 * This is the LargeInteger interface. Any class that implements this interface must have these methods.
 */
public interface LargeInteger extends Comparable{
	
	public int numberOfDigits();
	public int getDigitAt(int digitLocation);
	
	
	public LargeInteger add(LargeInteger largeInteger);
	
	public LargeInteger subtract(LargeInteger largeInteger);
	
	public LargeInteger negate();
	
	public LargeInteger abs();
	
	public LargeInteger multiply(LargeInteger largeInteger);
		
	public LargeInteger max(LargeInteger largeInteger);
	
	public LargeInteger min(LargeInteger largeInteger);
	
	public int signum();
	
	@Override
	public int compareTo(Object obj);
	
}
