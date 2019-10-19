import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
		
		System.out.println("Please input number of elements");
			int numberOfElements= in.nextInt();
		
		
		System.out.println("Please input some integers.");	
			int n;
			int integerArray[]= new int[numberOfElements];	

			for(int i = 0; i < numberOfElements; i++ ) {
					n= in.nextInt();
					integerArray[i]= n;

				}
	
	System.out.println("Please enter a value to find.");
		int valueToFind= in.nextInt();
		int counter=0;
		boolean intFound= false;
		for(int i: integerArray) {
			
			
			counter++;
			if(i == valueToFind) {
				System.out.println(valueToFind + " is at position " + counter);
				intFound= true;
				break;
			}
		
			
		}
		if(intFound== false){
			System.out.println(valueToFind + " does not exist");
		}
		
	

	}
	
}
