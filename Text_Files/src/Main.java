import java.io.FileNotFoundException;

/**
 * 
 * @author Trevor Little
 * @version 2/4/19
 * Text Files Lab
 * This is the main method
 */


public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		Warehouse wh= new Warehouse();
		wh.readInventoryFile("input.txt");
		wh.writeOutputFile("output.txt");
	}

}
