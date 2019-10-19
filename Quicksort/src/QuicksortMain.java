/**
 * 
 * @author Trevor Little
 * @version 9/23/19
 * Dr.Whitley
 * This is the quicksort and randomized quicksort algorithm implementations.
 */
import java.util.Arrays;
import java.util.Random;

public class QuicksortMain {
	
	public static void quicksort(int[] a, int start, int end) {
		if(start< end) {
			int q= partition(a, start, end);
			quicksort(a, start, q-1);
			quicksort(a, q+1, end);
			
		}
		
	}
	
	/**
	 * 
	 * @param a is the array we are trying to sort
	 * @param start is the start of the subproblem
	 * @param end is the end of of the subproblem
	 */
	public static void randomizedquicksort(int[] a, int start, int end) {
		if(start< end) {
			
			Random ran= new Random();
		
			int z= ran.nextInt(end-start)+start;
			swap(a, z, end);
			int q= partition(a, start, end);
			randomizedquicksort(a, start, q-1);
			randomizedquicksort(a, q+1, end);
			
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

	public QuicksortMain() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int[] t1= {1, 3, 5, 7, 4, 2};	
		quicksort(t1, 0, t1.length-1);
		System.out.println(Arrays.toString(t1));
		
		int[] t2= {1, 3, 5, 7, 4, 2};
		randomizedquicksort(t2, 0, t2.length-1);
		System.out.println(Arrays.toString(t2));
		
		System.out.println("--------------------------------");
		
		int[] t3= {1, 2, 3, 10, 14, 26, 18};	
		quicksort(t3, 0, t3.length-1);
		System.out.println(Arrays.toString(t3));
		
		int[] t4= {1, 2, 3, 10, 14, 26, 18};
		randomizedquicksort(t4, 0, t4.length-1);
		System.out.println(Arrays.toString(t4));
		
		
		System.out.println("--------------------------------");
		
		int[] t5= {18, 11, 3, 14, 16, 19, 19, 12, 15, 19};	
		quicksort(t5, 0, t5.length-1);
		System.out.println(Arrays.toString(t5));
		
		int[] t6= {18, 11, 3, 14, 16, 19, 19, 12, 15, 19};
		randomizedquicksort(t6, 0, t6.length-1);
		System.out.println(Arrays.toString(t6));
		
		
		System.out.println("--------------------------------");
		
		int[] t7= {17, 5, 21, 18, 9, 6, 20, 11, 12, 7};	
		quicksort(t7, 0, t7.length-1);
		System.out.println(Arrays.toString(t7));
		
		int[] t8= {17, 5, 21, 18, 9, 6, 20, 11, 12, 7};
		randomizedquicksort(t8, 0, t8.length-1);
		System.out.println(Arrays.toString(t8));
		
		System.out.println("--------------------------------");
		
		int[] t9= {26, 30, 5, 3, 1, 13,	14, 18, 22, 4};	
		quicksort(t9, 0, t9.length-1);
		System.out.println(Arrays.toString(t9));
		
		int[] t10= {26, 30, 5, 3, 1, 13, 14, 18, 22, 4};
		randomizedquicksort(t10, 0, t10.length-1);
		System.out.println(Arrays.toString(t10));
	}

}
