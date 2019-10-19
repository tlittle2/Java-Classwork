import java.util.ArrayList;
/**
 * 
 * @author Trevor Little
 * @version 4/29/19
 * This is the ArrayLargeInteger class.
 *
 */

public class ArrayLargeInteger implements LargeInteger {
	
	private ArrayList<Integer> a1;

	public ArrayLargeInteger(){
		a1= new ArrayList<Integer>();
	}
	
	public ArrayLargeInteger(String input) {
		a1= new ArrayList<Integer>();
		char neg = '-';
		if(input.indexOf(neg)== 0){
			a1.add(0, Character.getNumericValue(input.charAt(1))*-1);
				for(int i = 2; i < input.length(); i++) {
					a1.add(i-1, Character.getNumericValue(input.charAt(i)));
					
				}
		}else {
			for(int i =0; i < input.length(); i++) {
				a1.add(i, Character.getNumericValue(input.charAt(i)));
				
			}
		}
	}
	
	/**
	 * 
	 * @return returns a new output with all the leading zeros deleted.
	 */
	private LargeInteger removeLeadingZero() {
		ArrayLargeInteger output= new ArrayLargeInteger();
		ArrayLargeInteger reverse= new ArrayLargeInteger();
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
	 * Returns the hashcode of the object.
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((a1 == null) ? 0 : a1.hashCode());
		return result;
	}

	/**
	 * Returns whether or not the two objects are equal.
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ArrayLargeInteger other = (ArrayLargeInteger) obj;
		if (a1 == null) {
			if (other.a1 != null)
				return false;
		} else if (!a1.equals(other.a1))
			return false;
		return true;
	}

	/**
	 * returns a string representation of the arraylist.
	 */
	@Override
	public String toString() {
		return "[ "+ a1 +" ]";
	}

	/**
	 * adds numbers to the end of the arraylist.
	 * @param newNumber is the number value that we are adding to the list. 
	 */
	public void populate(int newNumber) {
		a1.add(0, newNumber);
	}
	

	
	/**
	 * @param the parameter largeInteger is the argument that we are trying to add.
	 * @return returns the sum of this number and the argument.
	 * 
	 */
	@Override
	public LargeInteger add(LargeInteger largeInteger) {
		ArrayLargeInteger sum= new ArrayLargeInteger();
		
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
		
		
		ArrayLargeInteger difference= new ArrayLargeInteger();
		
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
		ArrayLargeInteger negated= new ArrayLargeInteger();
		
		for(int i = a1.size()-1; i > 0; i--) {
			negated.populate(a1.get(i) * 1);
			
		}
		
		negated.populate(a1.get(0) * -1);
		return negated;
	}
	

	/**
	 * 
	 * @return returns the positive of the number.
	 * 
	 */
	@Override
	public LargeInteger abs() {
		ArrayLargeInteger abs= new ArrayLargeInteger();
		for(int i = a1.size()-1; i >= 0; i--) {
			if(a1.get(i) < 0) {
					abs.populate(a1.get(i) * -1);
			}else {
				abs.populate(a1.get(i));
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
	public LargeInteger multiply(LargeInteger largeInteger) {
		if(this.signum() < 0 && largeInteger.signum() < 0) {
			return largeInteger.negate().multiply(this.negate());
			
		}else if(this.signum() > 0 && largeInteger.signum() < 0) {
			return this.multiply(largeInteger.negate()).negate();
		}else if(this.signum() < 0 && largeInteger.signum() > 0) {
			return largeInteger.multiply(this.negate()).negate();
		}
		
		
		ArrayLargeInteger multiply= new ArrayLargeInteger();
		
		
		ArrayLargeInteger temp= new ArrayLargeInteger();
		ArrayLargeInteger temp2= new ArrayLargeInteger("1");
	
		temp.populate(0);
		multiply.populate(0);
		
		while(this.compareTo(temp) > 0) {
			temp = (ArrayLargeInteger)temp.add(temp2);
			multiply = (ArrayLargeInteger)multiply.add(largeInteger);
		}
		return multiply;
	}



	/**
	 * @param the parameter largeInteger is the number that we are trying to compare with.
	 * @return returns the number that is largest of the two numbers.
	 * 
	 */
	@Override
	public LargeInteger max(LargeInteger largeInteger) {
		if(this.compareTo(largeInteger) == -1) {
			return largeInteger;
			
			
		}
		return this;	
	}
		
		
	
	/**
	 * @param the parameter largeInteger is the number that we are trying to compare with.
	 * @return returns the number that is the smallest of the two numbers.
	 * 
	 */
	@Override
	public LargeInteger min(LargeInteger largeInteger) {
		if(this.compareTo(largeInteger) == 1) {
				return largeInteger;
				
				
			}
			return this;
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
	 * 
	 * @return returns the number of the digits in the number, or the size of the arraylist.
	 * 
	 */
	@Override
	public int numberOfDigits() {
		return a1.size();
		
	}


	/**
	 * @param the parameter digitLocation is the numbers place in the arrayList that we are trying to find.
	 * @return returns the digit at the argument
	 * 
	 */
	@Override
	public int getDigitAt(int digitLocation) {
		return a1.get(digitLocation-1);
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
	
	

}
