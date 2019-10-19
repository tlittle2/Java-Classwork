/**
 * 
 * @author Trevor Little
 *@version- 4/29/19
 *This is the BigInteger class that tests all public methods of ArrayLargeInteger and LinkedLargeInteger.
 */
public class BigInteger {

	public BigInteger() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		ArrayLargeInteger a1= new ArrayLargeInteger("100");
		ArrayLargeInteger a2= new ArrayLargeInteger("-10");
		ArrayLargeInteger a3= new ArrayLargeInteger("20");
		ArrayLargeInteger a4= new ArrayLargeInteger("-20");
		ArrayLargeInteger a5= new ArrayLargeInteger("0");
		
		
		System.out.println("Array Tests:");
		System.out.println(a1.toString());
		System.out.println(a2.toString());
		System.out.println(a3.toString());
		System.out.println(a4.toString());
		System.out.println(a5.toString());
		
		System.out.println();
	
		
		
		System.out.println("Array Add:");
		System.out.println(a1.add(a2));
		System.out.println("Nano Time: " + System.nanoTime());
		
		System.out.println(a2.add(a3));
		System.out.println("Nano Time: " + System.nanoTime());
		
		System.out.println(a1.add(a3));
		System.out.println("Nano Time: " + System.nanoTime());
		
		System.out.println(a2.add(a4));
		System.out.println("Nano Time: " + System.nanoTime());
		
		System.out.println();
		System.out.println();
		
		System.out.println("Array Subtract:");
		System.out.println(a1.subtract(a2));
		System.out.println("Nano Time: " + System.nanoTime());
		
		System.out.println(a2.subtract(a3));
		System.out.println("Nano Time: " + System.nanoTime());
		
		System.out.println(a1.subtract(a3));
		System.out.println("Nano Time: " + System.nanoTime());
		
		System.out.println(a2.subtract(a4));
		System.out.println("Nano Time: " + System.nanoTime());
		
		System.out.println();
		System.out.println();
		
		
		System.out.println("Array Multiply:");
		System.out.println(a1.multiply(a2));
		System.out.println("Nano Time: " + System.nanoTime());
		
		System.out.println(a2.multiply(a3));
		System.out.println("Nano Time: " + System.nanoTime());
		
		System.out.println(a1.multiply(a3));
		System.out.println("Nano Time: " + System.nanoTime());
		
		System.out.println(a2.multiply(a4));
		System.out.println("Nano Time: " + System.nanoTime());
		
		
		System.out.println();
		System.out.println();
		
		System.out.println("Array Negate:");
		System.out.println(a1.negate());
		System.out.println("Nano Time: " + System.nanoTime());
		System.out.println(a2.negate());
		System.out.println("Nano Time: " + System.nanoTime());
		
		System.out.println();
		System.out.println();
		
		System.out.println("Array Abs:");
		System.out.println(a2.abs());
		System.out.println("Nano Time: " + System.nanoTime());
		System.out.println(a1.abs());
		System.out.println("Nano Time: " + System.nanoTime());
		
		System.out.println();
		System.out.println();
		
		System.out.println("Array Max:");
		System.out.println(a1.max(a2));
		System.out.println("Nano Time: " + System.nanoTime());
		System.out.println(a4.max(a2));
		System.out.println("Nano Time: " + System.nanoTime());
		
		System.out.println();
		System.out.println();
		
		System.out.println("Array Min:");
		System.out.println(a1.min(a2));
		System.out.println("Nano Time: " + System.nanoTime());
		System.out.println(a4.min(a2));
		System.out.println("Nano Time: " + System.nanoTime());
		
		System.out.println();
		System.out.println();
		
		System.out.println("Array Signum:");
		System.out.println(a1.signum());
		System.out.println("Nano Time: " + System.nanoTime());
		System.out.println(a2.signum());
		System.out.println("Nano Time: " + System.nanoTime());
		System.out.println(a5.signum());
		System.out.println("Nano Time: " + System.nanoTime());
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		LinkedLargeInteger l1= new LinkedLargeInteger("100");
		LinkedLargeInteger l2= new LinkedLargeInteger("-10");
		LinkedLargeInteger l3= new LinkedLargeInteger("20");
		LinkedLargeInteger l4= new LinkedLargeInteger("-20");
		LinkedLargeInteger l5= new LinkedLargeInteger("0");
		
		System.out.println("Linked Tests:");
		System.out.println(l1.toString());
		System.out.println(l2.toString());
		System.out.println(l3.toString());
		System.out.println(l4.toString());
		System.out.println(l5.toString());
		
		System.out.println();
		
		System.out.println("Linked Add:");
		System.out.println(l1.add(l2));
		System.out.println("Nano Time: " + System.nanoTime());
		
		System.out.println(l2.add(l3));
		System.out.println("Nano Time: " + System.nanoTime());
		
		System.out.println(l1.add(l3));
		System.out.println("Nano Time: " + System.nanoTime());
		
		System.out.println(l2.add(l4));
		System.out.println("Nano Time: " + System.nanoTime());
		
		System.out.println();
		System.out.println();
		
		System.out.println("Linked Subtract:");
		System.out.println(l1.subtract(l2));
		System.out.println("Nano Time: " + System.nanoTime());
		
		System.out.println(l2.subtract(l3));
		System.out.println("Nano Time: " + System.nanoTime());
		
		System.out.println(l1.subtract(l3));
		System.out.println("Nano Time: " + System.nanoTime());
		
		System.out.println(l2.subtract(l4));
		System.out.println("Nano Time: " + System.nanoTime());
		
		System.out.println();
		System.out.println();		
		
		System.out.println("Linked Multiply:");
		System.out.println(l1.multiply(l2));
		System.out.println("Nano Time: " + System.nanoTime());
		
		System.out.println(l2.multiply(l3));
		System.out.println("Nano Time: " + System.nanoTime());
		
		System.out.println(l1.multiply(l3));
		System.out.println("Nano Time: " + System.nanoTime());
		
		System.out.println(l2.multiply(l4));
		System.out.println("Nano Time: " + System.nanoTime());
		
		
		System.out.println();
		System.out.println();
		
		System.out.println("Linked Negate:");
		System.out.println(l1.negate());
		System.out.println("Nano Time: " + System.nanoTime());
		System.out.println(l2.negate());
		System.out.println("Nano Time: " + System.nanoTime());
		
		System.out.println();
		System.out.println();
		
		System.out.println("Linked Abs:");
		System.out.println(l2.abs());
		System.out.println("Nano Time: " + System.nanoTime());
		System.out.println(l1.abs());
		System.out.println("Nano Time: " + System.nanoTime());
		
		System.out.println();
		System.out.println();
		
		System.out.println("Linked Max:");
		System.out.println(l1.max(l2));
		System.out.println("Nano Time: " + System.nanoTime());
		System.out.println(l4.max(l2));
		System.out.println("Nano Time: " + System.nanoTime());
		
		System.out.println();
		System.out.println();
		
		System.out.println("Linked Min:");
		System.out.println(l1.min(l2));
		System.out.println("Nano Time: " + System.nanoTime());
		System.out.println(l4.min(l2));
		System.out.println("Nano Time: " + System.nanoTime());
		
		System.out.println();
		System.out.println();
		
		System.out.println("Linked Signum:");
		System.out.println(l1.signum());
		System.out.println("Nano Time: " + System.nanoTime());
		System.out.println(l2.signum());
		System.out.println("Nano Time: " + System.nanoTime());
		System.out.println(l5.signum());
		System.out.println("Nano Time: " + System.nanoTime());
		
		
	
	
	}
	

}
