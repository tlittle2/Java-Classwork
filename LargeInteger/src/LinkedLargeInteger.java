import java.util.ArrayList;
import java.util.LinkedList;

/**
 * 
 * @author Trevor Little
 * @version 4/29/19
 * This is the LinkedLargeInteger class.
 *
 */

public class LinkedLargeInteger implements LargeInteger {

	LinkedList<Integer> l1;
	
	
	public LinkedLargeInteger(){
		l1= new LinkedList<Integer>();
	}
    	
	public LinkedLargeInteger(String input) {
		l1= new LinkedList<Integer>();
		char neg = '-';
		if(input.indexOf(neg)== 0){
			l1.add(0, Character.getNumericValue(input.charAt(1))*-1);
				for(int i = 2; i < input.length(); i++) {
					l1.add(i-1, Character.getNumericValue(input.charAt(i)));
					
				}
		}else {
			for(int i =0; i < input.length(); i++) {
				l1.add(i, Character.getNumericValue(input.charAt(i)));
				
			}
		}
	}
	
	/**
	 * @param the parameter obj is the value that we are trying to compare with.
	 * @return returns an int value that represents if the number is bigger, smaller, or the same.
	 * 
	 */
	@Override
	public int compareTo(Object obj) {
		LargeInteger that= (LargeInteger)obj;
		
		if(this.getDigitAt(1) > 0 && that.getDigitAt(1) < 0 ){
			return 1;
			
		}else if(this.getDigitAt(1) < 0 && that.getDigitAt(1) > 0 ) {
			return -1;
		}
		
			if(this.numberOfDigits() > that.numberOfDigits()){
				return 1;
			}else if(this.numberOfDigits() < that.numberOfDigits()) {
				return -1;
			}else {
				for(int i = 0; i < this.numberOfDigits(); i++) {
					if(this.getDigitAt(i+1) > that.getDigitAt(i+1)) {
						return 1;
					}else if(this.getDigitAt(i+1) < that.getDigitAt(i+1)) {
						return -1;
					}
				}
			}
		
			return 0;
	}
	
	/**
	 * @param the parameter largeInteger is the argument that we are trying to add.
	 * @return returns the sum of this number and the argument.
	 * 
	 */
	@Override
	public LargeInteger add(LargeInteger largeInteger) {
		LinkedLargeInteger sum= new LinkedLargeInteger();
		
		if(this.signum() < 0 && largeInteger.signum() < 0) {
			return this.negate().add(largeInteger.negate()).negate();
			
		}else if(this.signum() > 0 && largeInteger.signum() < 0) {
			return this.subtract(largeInteger.negate());
		}else if(this.signum() < 0 && largeInteger.signum() > 0) {
			return largeInteger.subtract(this.negate());
		}
		
		int digitsum= 0;
		int carry = 10;
		int carryBit= 0;
		for(int i = this.numberOfDigits(),  j= largeInteger.numberOfDigits(); i > 0 || j > 0; i--, j--) {
			
			if(i <= 0 ) {
				digitsum= 0 + largeInteger.getDigitAt(j);
			}else if(j <= 0){
				digitsum= this.getDigitAt(i) + 0;
				
				
			}else{
				digitsum= this.getDigitAt(i) + largeInteger.getDigitAt(j);	
			}
			
			
			if(digitsum + carryBit >= carry) {
				
				sum.populate((digitsum+carryBit) % 10);
				carryBit= 1;

			}else {
				
				sum.populate(digitsum + carryBit);
				carryBit= 0;
			}
			
		}
		if (carryBit >  0) {
			sum.populate(carryBit);
		}
		
		return sum;
	}
	
	/**
	 * 
	 * @return returns a new output with all the leading zeros deleted.
	 */
	private LargeInteger removeLeadingZero() {
		LinkedLargeInteger output= new LinkedLargeInteger();
		LinkedLargeInteger reverse= new LinkedLargeInteger();
		boolean b = true;
		for(int i= 0; i < this.numberOfDigits(); i++) {
			if(this.getDigitAt(i+1)== 0 && b) {
			
				
			}else {
				output.populate(getDigitAt(i+1));
				b = false;
			}
			
		}
		
		for(int i = 0; i < output.numberOfDigits(); i++) {
			reverse.populate(output.getDigitAt(i+1));
		}
		
		
		return reverse;
	}
	
	/**
	 * @param the parameter largeInteger is the argument that we are trying to subtract.
	 * @return returns the difference of this number and the argument.
	 * 
	 */
	@Override
	public LargeInteger subtract(LargeInteger largeInteger) {
		if(this.signum() < 0 && largeInteger.signum() < 0) {
			return largeInteger.negate().add(this);
			
		}else if(this.signum() > 0 && largeInteger.signum() < 0) {
			return this.add(largeInteger.negate());
		}else if(this.signum() < 0 && largeInteger.signum() > 0) {
			return largeInteger.add(this.negate()).negate();
		}else if (this.signum() == 0) {
			return largeInteger.negate();
		}else if(largeInteger.signum() ==0) {
			return this;
		}
		
		if(this.compareTo(largeInteger) < 0) {
			return largeInteger.subtract(this).negate();
		}
		
		
		LinkedLargeInteger difference= new LinkedLargeInteger();
		
		int digitDifference= 0;
		int carry = 10;
		int carryBit= 0;
		
		for(int i = this.numberOfDigits(), j= largeInteger.numberOfDigits(); i > 0 || j > 0; i--, j--) {
			
			if(i <= 0 ) {
				digitDifference= 0 - largeInteger.getDigitAt(j);
			}else if(j <= 0){
				digitDifference= this.getDigitAt(i) - 0;
				
				
			}else{
				digitDifference= this.getDigitAt(i) - largeInteger.getDigitAt(j);	
			}
			
			
			if(digitDifference + carryBit < 0) {
				
				difference.populate((digitDifference+carryBit) + 10);
				carryBit= -1;

			}else {
				
				difference.populate((digitDifference+carryBit));
				carryBit= 0;
			}
			
		}
		if (carryBit < 0) {
			difference.populate(carryBit);
		}
		
		
		return difference.removeLeadingZero();
	}
	
	/**
	 *
	 * @return returns the opposite sign of the number.
	 *  
	 */
	@Override
	public LargeInteger negate() {
		LinkedLargeInteger negated= new LinkedLargeInteger();
		
		for(int i = l1.size()-1; i > 0; i--) {
			negated.populate(l1.get(i) * 1);
			
		}
		
		negated.populate(l1.get(0) * -1);
		return negated;
	}
	
	
	/**
	 * 
	 * @return returns the positive of the number.
	 * 
	 */
	@Override
	public LargeInteger abs() {
		LinkedLargeInteger abs= new LinkedLargeInteger();
		for(int i = l1.size()-1; i >= 0; i--) {
			if(l1.get(i) < 0) {
					abs.populate(l1.get(i) * -1);
			}else {
				abs.populate(l1.get(i));
			}
			
		}
		return abs;
	}
	
	/**
	 * @param the parameter largeInteger is the argument that we are trying to multiply.
	 * @return returns the product of this number and the argument.
	 * 
	 */
	@Override
	public LargeInteger multiply(LargeInteger integer) {
		if(this.signum() < 0 && integer.signum() < 0) {
			return integer.negate().multiply(this.negate());
			
		}else if(this.signum() > 0 && integer.signum() < 0) {
			return this.multiply(integer.negate()).negate();
		}else if(this.signum() < 0 && integer.signum() > 0) {
			return integer.multiply(this.negate()).negate();
		}
		
		
		LinkedLargeInteger multiply= new LinkedLargeInteger();
		
		
		ArrayLargeInteger temp= new ArrayLargeInteger();
		ArrayLargeInteger temp2= new ArrayLargeInteger("1");
	
		temp.populate(0);
		multiply.populate(0);
		
		while(this.compareTo(temp) > 0) {
			temp = (ArrayLargeInteger)temp.add(temp2);
			multiply = (LinkedLargeInteger)multiply.add(integer);
		}
		return multiply;
	}
	
	/**
	 * @param the parameter largeInteger is the argument that we are trying to compare.
	 * @return returns the number that is largest of the two numbers.
	 * 
	 */
	@Override
	public LargeInteger max(LargeInteger integer) {
		if(this.compareTo(integer) == -1) {
			return integer;
			
			
		}
		return this;
	}
	
	/**
	 * @param the parameter largeInteger is the argument that we are trying to compare.
	 * @return returns the number that is the smallest of the two numbers. 
	 * 
	 */
	@Override
	public LargeInteger min(LargeInteger integer) {
		if(this.compareTo(integer) == 1) {
			return integer;
			
			
		}
		return this;
	}
	/**
	 *@return returns the hashcode of the object.
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((l1 == null) ? 0 : l1.hashCode());
		return result;
	}
	
	/**
	 * @return returns whether or not two objects are equal.
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LinkedLargeInteger other = (LinkedLargeInteger) obj;
		if (l1 == null) {
			if (other.l1 != null)
				return false;
		} else if (!l1.equals(other.l1))
			return false;
		return true;
	}
	
	/**
	 *@return returns a string representation of the linkedlist.
	 */
	@Override
	public String toString() {
		return " [" + l1 + "]";
	}
	
	/**
	 * 
	 * @return returns the number of the digits in the number, or the size of the linkedlist.
	 * 
	 */
	@Override
	public int numberOfDigits() {
		return l1.size();
	}
	

	/**
	 * @param the parameter digitLocation is the numbers place in the linkedlist that we are trying to find.
	 * @return returns the digit at the argument.
	 * 
	 */
	@Override
	public int getDigitAt(int digitLocation) {
		return l1.get(digitLocation - 1);
	}
	
	/**
	 * 
	 * @return returns an integer that represents whether the number is negative, positive, or zero.
	 * 
	 */
	@Override
	public int signum() {
		boolean zero = true;
		for(int i=0; i < this.numberOfDigits(); i++) {
			if(this.getDigitAt(i+1) != 0) {
				zero = false;
			}
		}
		if(zero) {
			return 0;
		}
		else if(this.getDigitAt(1) > 0) {
			return 1;
		}
		
		return -1;
	}
	
	/**
	 * adds numbers to the end of the linkedlist.
	 * @param newNumber is the number value that we are adding to the list.
	 */
	public void populate(int newNumber) {
		l1.add(0, newNumber);
	}
	


}
