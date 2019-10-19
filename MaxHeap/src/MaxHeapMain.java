/**
 * 
 * @author Trevor Little
 * @version 9/13/19
 * This is the MaxHeap main method that runs the MaxHeap data structure.
 */
public class MaxHeapMain {

	public MaxHeapMain() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int[] a1= {7, 8, 9, 4, 5, 6, 7};
		System.out.print("Original array: ");
			for(int i= 0; i < a1.length; i++) {
				System.out.print(a1[i] + ", ");
				
			}
			System.out.println();
			
		MaxHeap h1= new MaxHeap(a1);
		h1.printMaxHeap();
		h1.heapsort();
		h1.printMaxHeap();
		
		System.out.println("------------------------");
		System.out.println();
		
				
		int[] a2= {9, 10, 8, 11, 9, 7, 6, 4, 12, 5};
		System.out.print("Original array: ");
		for(int i= 0; i < a2.length; i++) {
			System.out.print(a2[i] + ", ");
			
		}
		System.out.println();
		
		MaxHeap h2= new MaxHeap(a2);
		h2.printMaxHeap();
		h2.heapsort();
		h2.printMaxHeap();
		
		System.out.println("------------------------");
		System.out.println();
		
		int[] a3= {7,10,20,3,4,49,50};
		System.out.print("Original array: ");
		for(int i= 0; i < a3.length; i++) {
			System.out.print(a3[i] + ", ");
			
		}
		System.out.println();
		
		MaxHeap h3= new MaxHeap(a3);
		h3.printMaxHeap();
		h3.heapsort();
		h3.printMaxHeap();
		
		System.out.println("------------------------");
		System.out.println();
		
		
		int[] a4= {3, 7, 8, 9, 10, 11, 10, 12};
		System.out.print("Original array: ");
		for(int i= 0; i < a4.length; i++) {
			System.out.print(a4[i] + ", ");
			
		}
		System.out.println();
		
		MaxHeap h4= new MaxHeap(a4);
		h4.printMaxHeap();
		h4.heapsort();
		h4.printMaxHeap();
		
		System.out.println("------------------------");
		System.out.println();
		
		
		int[] a5= {3, 7};
		System.out.print("Original array: ");
		for(int i= 0; i < a5.length; i++) {
			System.out.print(a5[i] + ", ");
			
		}
		System.out.println();
		
		MaxHeap h5= new MaxHeap(a5);
		h5.printMaxHeap();
		h5.heapsort();
		h5.printMaxHeap();
		
		
		
	}

}
