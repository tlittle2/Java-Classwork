/**
 * 
 * @author Trevor Little
 * @version 3/1/19
 * This is the ArrayPalindrome class that will use an ArrayStack to test for palindromes.
 */

public class ArrayPalindrome extends ArrayStack {
		   
	    ArrayStack<Character> a1;
	    ArrayStack<Character> a2;
	    ArrayStack<Character> a3;
	   
	    
	public ArrayPalindrome() {
		a1= new ArrayStack<>();
		a2= new ArrayStack<>();
		a3= new ArrayStack<>();
	}
	
	
	public boolean isPalindrome(String word) {
		a1= new ArrayStack<>();
		a2= new ArrayStack<>();
		a3= new ArrayStack<>(); 
		
		word= word.toLowerCase();
		for(int i=0; i < word.length(); i++) {
			a1.push(word.charAt(i));
			a2.push(word.charAt(i));
		}
		
		while(!a2.isEmpty()) {
			a3.push(a2.pop());
		}
		
		while(!a3.isEmpty()) {
			if(a1.pop() == a3.pop()) {
				
	
			}else {
				return false;	
			}
					
		}
			
		return true;
		
	}
    
    
    
    
   
	public static void main(String[] args) {
		ArrayPalindrome Test1= new ArrayPalindrome();
	
		
		System.out.println(Test1.isPalindrome("bob"));
		System.out.println(Test1.isPalindrome("baseball"));
		System.out.println(Test1.isPalindrome("repaper"));
		System.out.println(Test1.isPalindrome("mayamoodybabydoomayam"));
		System.out.println(Test1.isPalindrome("supercalifragilisticexpialidocious"));
		System.out.println(Test1.isPalindrome("DocNoteIDissentAFastNeverPreventsAFatnessIDietOnCod"));
	
	}
    

}
