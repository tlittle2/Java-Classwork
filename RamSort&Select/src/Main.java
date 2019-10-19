/**
 * 
 * @author Trevor Little
 * @version 10/2/19
 * These are the Java implementations for countingSort and randomizedQuickselect.
 */
import java.util.Arrays;
import java.util.Random;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * 
	 * @param a is the array we are trying to invoke countSort on.
	 * @param b is the array we wish to display our sorted output into.
	 * @param k is the largest value in array a.
	 */
	public static void countingSort(int [] a, int [] b, int k){
		int[] c= new int[k+1];

		for(int i = 0; i <= k; i++){
			c[i]= 0;
		
		}

		for(int i = 0; i < a.length; i++){
			c[a[i]]++;
		}

		
		for (int i= 1; i <= k; i++){
			c[i]+= c[i-1];
			
		}
		
		for(int i= a.length-1; i >= 0; i--){
			b[c[a[i]]-1]= a[i];
			c[a[i]]--;
		}

		
	}
	/**
	 * 
	 * @param a is the array we wish to invoke the method on.
	 * @param lower is the lower bound of the subproblem.
	 * @param upper is the upperbound of the subproblem.
	 * @param i is the order statistic that we are trying to find.
	 * @return randomizedQuickSelect method on a smaller subproblem until we find desired value
	 */
	public static int randomizedQuickSelect(int[]a, int lower, int upper, int i) {
		int[] copy= Arrays.copyOf(a, a.length);
		if(lower== upper) {
			return copy[lower];
		}
		
		Random ran= new Random();
		
		int z= ran.nextInt(upper - lower)+lower;
		swap(copy, z, upper);
		
		int q= partition(copy, lower, upper);
		
		int k= q- lower + 1;
		if (i==k) {
			return copy[q];
		}else if(i < k) {
			return randomizedQuickSelect(copy, lower, q-1, i);
		}else{
			return randomizedQuickSelect(copy, q+1, upper, i-k);
		}
		
	}
	/**
	 * 
	 * @param a is the array we are trying to sort
	 * @param lowerBound is the start of the subproblem
	 * @param upperBound is the end of the subproblem
	 * @return the midpoint of the two subproblems
	 */
	private static int partition(int []a, int lowerBound, int upperBound) {
		int midPoint= a[upperBound];
		int i= lowerBound-1;
		
		for(int j= lowerBound; j< upperBound; j++) {
			if(a[j] <= midPoint){
				i+=1;
				swap(a, i, j);
				
			}
		}
		swap(a,i+1, upperBound);
		return i+1;
	}
	
	/**
	 * 
	 * @param a is the array in which we are trying to swap values
	 * @param index1 is the first index we want to swap
	 * @param index2 is the second index we want to swap 
	 */
	private static void swap(int[]a, int index1, int index2) {
		int temp= a[index1];
		int temp2= a[index2];
		
		a[index1]= temp2;
		a[index2]= temp;
	}
	
	
	

	public static void main(String[] args) {
		int[] input1= {10, 8, 7, 4, 5, 3, 2, 2, 1, 7};
		
		int[] output1= new int[10];
		
		countingSort(input1, output1, 10);
		
		System.out.println(Arrays.toString(output1));
			
		int k1= randomizedQuickSelect(input1, 0, input1.length-1, 4);
		
		System.out.println(k1);
		
		System.out.println(Arrays.toString(input1));
				
		System.out.println("__________________________________");
		
		
		int[] input2= {96, 44, 79, 87, 79, 48, 71, 13};
		
		int[] output2= new int[8];
		
		countingSort(input2, output2, 96);
		
		System.out.println(Arrays.toString(output2));
			
		int k2= randomizedQuickSelect(input2, 0, input2.length-1, 8);
		
		System.out.println(k2);
		
		System.out.println(Arrays.toString(input2));
				
		System.out.println("___________________________________");
		
		
		
		int[] input3= {88, 38, 41, 66, 88, 95, 21, 81, 32, 85, 16, 33};
		
		int[] output3= new int[12];
		
		countingSort(input3, output3, 95);
		
		System.out.println(Arrays.toString(output3));
			
		int k3= randomizedQuickSelect(input3, 0, input3.length-1, 6);
		
		System.out.println(k3);
		
		System.out.println(Arrays.toString(input3));
				
		System.out.println("___________________________________");
		
		
		
		int[] input4= {57, 92, 43, 31, 43};
		
		int[] output4= new int[5];
		
		countingSort(input4, output4, 92);
		
		System.out.println(Arrays.toString(output4));
			
		int k4= randomizedQuickSelect(input4, 0, input4.length-1, 1);
		
		System.out.println(k4);
		
		System.out.println(Arrays.toString(input4));
				
		System.out.println("___________________________________");
		
		
		int[] input5= {10,9,8,7,6,5};
		
		int[] output5= new int[6];
		
		countingSort(input5, output5, 10);
		
		System.out.println(Arrays.toString(output5));
			
		int k5= randomizedQuickSelect(input5, 0, input5.length-1, 5);
		
		System.out.println(k5);
		
		System.out.println(Arrays.toString(input5));
				
		
		

	}

}
