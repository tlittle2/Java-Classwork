/**
 * 
 * @author Trevor Little
 * @version 2/4/19
 * Text Files Lab
 * This is the class that defines and initializes an ArrayList that each InventoryItem will be
 * read into (from input.txt). All input will be written out to a file (output.txt).
 */


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Warehouse {
	private ArrayList <InventoryItem> inventory;
	
	
	public Warehouse() {
		this.inventory= new ArrayList<InventoryItem>();
		
		
	}
	
	public void readInventoryFile(String inputFile) throws FileNotFoundException {
		File file= new File(inputFile);
		Scanner scan= null;
		try {
		scan= new Scanner(file);
		
		}catch(FileNotFoundException e){
			System.out.println("Input File " + inputFile + " does not exist.");
		}
		String description;
		
		int sku;
		
		double price;
		
		int quantity;
			
		
		while(scan.hasNextLine()) {

			description= scan.nextLine();
						
			sku= scan.nextInt();
						
			price= scan.nextDouble();
					 	
			quantity= scan.nextInt();
			
			scan.nextLine();
			
			inventory.add(new InventoryItem(description, sku, price, quantity));
			
		}
		scan.close();
	}
	
	public void writeOutputFile(String outputFile) {
		PrintWriter pw= null;
		
		try {
			pw = new PrintWriter("output.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Unknown error opening" + outputFile);
		}
		
		
		for(InventoryItem i: inventory) {
			
			pw.print(i);
		}
		
		pw.close();
		
	}
	
	
}
