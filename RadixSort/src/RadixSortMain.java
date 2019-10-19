
public class RadixSortMain {

	public RadixSortMain() {
		// TODO Auto-generated constructor stub
	}
	
	
	public static void radixSort(int[] a, int digits) {
		int [] b= new int[a.length];
		for(int i = 0; i < digits; i++) {
			countingSort(a, b, i);
			
		}
	}
	
	
	private static void countingSort(int [] a, int [] b, int digits){
		int k= 9;
		int divisor= (int)(Math.pow(10, digits));
		int[] c= new int[k+1];

		for(int i = 0; i <= k; i++){
			c[i]= 0;
		
		}

		for(int i = 0; i < a.length; i++){
			c[(a[i]/divisor) % 10]++;
		}

		
		for (int i= 1; i <= k; i++){
			c[i]+= c[i-1];
			
		}
		
		for(int i= a.length-1; i >= 0; i--){
			b[c[(a[i]/divisor) % 10]-1]= a[i];
			c[(a[i]/divisor) % 10]--;
		}

		for (int i = 0; i < a.length; i++) 
            a[i] = b[i];
	}
	
	public static void print(int a[]) 
    { 
        for (int i=0; i< a.length; i++) 
            System.out.print(a[i]+ ", "); 
    }

	public static void main(String[] args) {
		int[] input= {129, 539, 789, 785, 893, 340, 114, 682};
		
		radixSort(input, 3);
		print(input);
		
		System.out.println();
		
		int[] input2= {1129, 3539, 2789, 7785, 3893, 4340, 5114, 6682};
		radixSort(input2, 4);
		print(input2);
		
		System.out.println();
		
		int[] input3= {1129, 3539, 789, 775, 3893, 4340, 5114, 682};
		radixSort(input3, 4);
		print(input3);
	}

}
