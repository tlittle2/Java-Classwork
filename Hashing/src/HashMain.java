/**
 * @author Trevor Little
 * @version 10/9/19
 * This is the chained and open hashtable driver class.
 */
import java.util.Random;

public class HashMain {

	public HashMain() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args){
		ChainedHashTable c1= new ChainedHashTable(20);
		System.out.println("Original Hashtable:");
		c1.insert(1);
		c1.insert(2);
		c1.insert(3);
		c1.insert(5);
		c1.insert(7);
		c1.insert(14);
		c1.insert(12);
		c1.insert(19);
		c1.insert(23);
		c1.insert(27);
		c1.insert(33);
		c1.insert(43);
		c1.insert(56);
		c1.insert(65);
		c1.insert(77);
		
		c1.printTable();
		
		
		System.out.println("New Hashtable:");
		c1.delete(19);
		c1.delete(1);
		c1.delete(2);
		c1.delete(3);
		c1.delete(27);
		
		c1.printTable();
		
		System.out.println();
		
		System.out.println("Search for values:");
		System.out.println(c1.search(14));
		System.out.println(c1.search(7));
		System.out.println(c1.search(23));
		System.out.println(c1.search(5));
		System.out.println(c1.search(12));
		
		System.out.println();
		
		System.out.println(c1.search(235));
		System.out.println(c1.search(6));
		System.out.println(c1.search(202));
		System.out.println(c1.search(343));
		System.out.println(c1.search(333));
		
		System.out.println("---------------------");
		
		OpenAddressedHashTable a1= new OpenAddressedHashTable(20);
		System.out.println("Original Hashtable:");
		a1.insert(1);
		a1.insert(2);
		a1.insert(3);
		a1.insert(5);
		a1.insert(7);
		a1.insert(14);
		a1.insert(12);
		a1.insert(19);
		a1.insert(23);
		a1.insert(27);
		a1.insert(33);
		a1.insert(43);
		a1.insert(56);
		a1.insert(65);
		a1.insert(77);
		
		a1.printTable();
		
		System.out.println();
		
		System.out.println("New Hashtable:");
		a1.delete(19);
		a1.delete(1);
		a1.delete(2);
		a1.delete(3);
		a1.delete(27);
		
		a1.printTable();
		
		System.out.println();
		System.out.println("Search for values:");
		
		System.out.println(a1.search(14));
		System.out.println(a1.search(5));
		System.out.println(a1.search(7));		
		System.out.println(a1.search(12));
		System.out.println(a1.search(23));
		
		System.out.println();
		
		System.out.println(a1.search(235));
		System.out.println(a1.search(201));
		System.out.println(a1.search(202));
		System.out.println(a1.search(333));
		System.out.println(a1.search(235));
			
	}

}
