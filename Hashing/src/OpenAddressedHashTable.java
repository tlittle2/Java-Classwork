/**
 * 
 * @author Trevor Little
 * @version 10/9/19
 * This is the OpenAddressedHashTable object.
 */
public class OpenAddressedHashTable {
	Integer[] array;
	double b= Math.random();
	final int DELETED= Integer.MIN_VALUE;
	
	public OpenAddressedHashTable(int n) {
		int m= (int)Math.pow(2,(Math.floor((Math.log(n)/Math.log(2)))+1));
		array= new Integer[m];
		for(int i = 0; i < array.length; i++) {
			array[i]= null;
		}
	}
	/**
	 * 
	 * @param x is the value we are trying to insert into the hashtable.
	 * @return the index at which the value was inserted, and null if the value cannot be inserted.
	 */	
	public Integer insert(Integer x) {
		for(int i=0; i < array.length; i++) {
			int j= hash(x, i);
			if(array[j]== null || array[j]== DELETED) {
				array[j]= x;
				return j;
			}
		}
		return null;
	}
	/**
	 * 
	 * @param x is the value we are trying to delete from the hashtable
	 * @return where the key was found at, and null if the hashtable does not contain the element
	 */
	public Integer delete(Integer x){
		for(int i = 0; i < array.length; i++) {
			int j= hash(x, i);
			if(array[j]== x){
				array[j]= DELETED;
				return j;
			}
		}
		return null;
		
	}
	
	/**
	 * 
	 * @param x is the element we are searching for.
	 * @return the index at which the index was found, and null if not found.
	 */
	public Integer search(Integer x) {
		for(int i= 0; i < array.length; i++) {
			int j= hash(x, i);
			if(array[j] == null){
				return null;
			}
			if(array[j] == x) {
				return x;
			}
			
		}
		return null;
	}
	
	public void printTable() {
		for(int i= 0; i < array.length; i++) {
			System.out.println(i + ": " + array[i]);
		}
		
	}
	/**
	 * 
	 * @param key is the value we are trying to hash.
	 * @return the index at which the key should go.
	 */
	private int hash(int key) {
		double value= array.length * (key * b % 1);
		int indx= (int) Math.floor(value);
		return indx;
	}
	
	/**
	 * 
	 * @param key is the value we invoke the hash on.
	 * @param index is where we are starting the probe sequence from.
	 * @return the appropriate index in the probe sequence where there might be no element.
	 */
	private int hash(int key, int index) {
		index += hash(key);
		index= index % array.length;
		return index;
		
		
	}

}
