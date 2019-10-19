/**
 * 
 * @author Trevor Little
 *@version 4/12/19
 *This is the Recursion part of Lab10
 */
public class Recursion {

	public Recursion() {
		// TODO Auto-generated constructor stub
	}

	public static void recursivePrint(int currentLevel, int maxLevel) {
		
	String tab= " ";
	
		for(int i = 0; i < currentLevel-1; i++) {
			tab+="\t";
		}
		
			
			if(maxLevel !=0) {
				System.out.println(tab+"This was written by call number " + currentLevel);
				
				recursivePrint(currentLevel + 1, maxLevel-1);
				System.out.println(tab + "This was ALSO written by call number" + currentLevel);
				
			
			}
			
		
		
	}
	
	
	public static void main(String[] args) {
		recursivePrint(1, 4);

	}

}
