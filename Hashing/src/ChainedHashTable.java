/**
 * @author Trevor Little
 * @version 10/9/19
 * This is the ChainedHashTable object
 */
import java.util.LinkedList;
public class ChainedHashTable {
	LinkedList<Integer>[] a;
	
	double b= Math.random();
	
	
	
	public ChainedHashTable(int n) {	
		int m= (int)Math.pow(2,(Math.floor((Math.log(n)/Math.log(2)))+1));
		a= new LinkedList[m];
		
		for(int i = 0; i < m; i++) {
			 a[i]= new LinkedList<Integer>();
		 }
		
			
	}
	
	/**
	 * 
	 * @param x is the element we are trying to insert into the hashtable.
	 */
	//x should be a Integer object
	public void insert(Integer x) {
		LinkedList <Integer> t= a[hash(x)];
		t.addFirst(x);
		
		
	}
	/**
	 * 
	 * @param x is the element we are trying to delete from the hashtable.
	 */
	//x should be a Integer object
	public void delete(Integer x) {
		LinkedList <Integer> t= a[hash(x)];
			if(t.contains(x)) {
				t.removeFirstOccurrence(x);
			}else {
				System.out.println("Element you are trying to delete is not contained in the list.");
			}
		
		
	}
	
	/**
	 * 
	 * @param x is the element we are trying to search for.
	 * @return the index of the element if it is found, and -1 if it is not in the hashtable.
	 */
	public Integer search(Integer x) {
		LinkedList<Integer> t= a[hash(x)];
			if(t.contains(x)) {
				return x;
			}
			return null;
	}
	
	public void printTable() {
		for(int i =0; i < a.length; i++) {
			System.out.print(i + ": ");
			for(int j= 0; j < a[i].size(); j++) {
				System.out.print(a[i].get(j)+ ", ");
			}
			System.out.println();
			
		}
		
	}
	/**
	 * 
	 * @param key is the value we are invoking the hash method. 
	 * @return the index at which the element should be at.
	 */
	private int hash(int key) {
		double value= a.length * (key * b % 1);
		int indx= (int) Math.floor(value);
		return indx;
	}

}
