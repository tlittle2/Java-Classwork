/**
 * 
 * @author Trevor Little
 * @version 9/13/19
 * This is the MaxHeap class that defines the MaxHeap algorithms.
 */


import java.util.Arrays;

public class MaxHeap {
	private int[] array;
	private int heapsize;
	
	public MaxHeap(int[] a) {
		array= a;
		heapsize= array.length;
		buildMaxHeap();
	}

	
/**
 * 	
 * @param i is the current node we are looking at it. It is always the parent node. 
 * @return the leftChild of current node, or -1 if it does not exist
 */
	private int leftChildOf(int i) {
		if(heapsize> (2*i+1)) {
			return 2*i+1;
		}
		return -1;
		
	}
	/**
	 * 	
	 * @param i is the current node we are looking at it. It is always the parent node. 
	 * @return the rigthChild of current node, or -1 if it does not exist
	 */	
	private int rightChildOf(int i) {
		if(heapsize > (2* i +2)){
			return (2 *i+2);
		}
		return -1;

	}

	public void printMaxHeap() {
		System.out.println("Heapsize: " + heapsize);
		for(int i= 0; i < heapsize; i++) {
			System.out.print(array[i] + ", ");
		}
		System.out.println();
		
	}
/**
 * 	
 * @param i is an internal parent node that we are at currently
 */
	public void maxHeapify(int i) {
		int leftChild= leftChildOf(i);
		int rightChild= rightChildOf(i);
		int largest = i;
		
		if (leftChild != -1) {
			if(array[leftChild] > array[i]) {
				largest= leftChild;
			}
		}
		if(rightChild != -1) { 
			if(array[rightChild] > array[i] && array[rightChild] > array[leftChild]) {
				largest= rightChild;
			}
		}
		
		if(largest != i) {
			swap(i, largest);
			maxHeapify(largest);
		}
		
	}
	
	private void buildMaxHeap() {
		for(int i= heapsize/2; i >=0; i--) {
			maxHeapify(i);
		}
	}
	
	public void heapsort() {
		buildMaxHeap();
		int backupCopy= heapsize;
		for(int i= heapsize-1; i>=1; i--) {
			swap(0, i);
			heapsize--;
			maxHeapify(0);
		
		}
		heapsize= backupCopy;
	}
/**
 * 	
 * @param index1 indicates the node that we wish to swap
 * @param index2 indicates another that we wish to swap
 */
	private void swap(int index1, int index2) {
		if(index1 > heapsize || index2 > heapsize) {
			return;
		}
		int temp= array[index1];
		int temp2= array[index2];
		
		array[index1]= temp2;
		array[index2]= temp;
	}



	@Override
	public String toString() {
		return "MaxHeap " + Arrays.toString(array) + " heapsize=" + heapsize;
	}
	
	
	

}
