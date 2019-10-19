/**
 * 
 * @author Trevor Little
 * @version 3/1/19
 * This is the LinkedPalindrome class that will use a LinkedStack to test for palindromes.
 */
public class LinkedPalindrome extends LinkedStack {
	        
    LinkedStack<Character> l1;
    LinkedStack<Character> l2;
    LinkedStack<Character> l3;
    
    public LinkedPalindrome() {
    	l1= new LinkedStack<>();
    	l2= new LinkedStack<>();
    	l3= new LinkedStack<>();
 
    }
    
    
    public boolean isPalindrome(String word) {
    	l1= new LinkedStack<>();
    	l2= new LinkedStack<>();
    	l3= new LinkedStack<>();
    	
    	word= word.toLowerCase();
		for(int i=0; i < word.length(); i++) {
			l1.push(word.charAt(i));
			l2.push(word.charAt(i));
		}
		
		while(!l2.isEmpty()) {
			l3.push(l2.pop());
		}
		
		while(!l3.isEmpty()) {
			if(l1.pop() == l3.pop()) {
	
			}else {
				System.out.println(word + " is not a palindrome");
				return false;	
			}
			
			
			
		}
		System.out.println(word + " is a palindrome");
		return true;
	}
	
		
	public static void main(String[] args) {
		
		LinkedPalindrome Test1= new LinkedPalindrome();
		
		Test1.isPalindrome("bob");
		Test1.isPalindrome("baseball");
		Test1.isPalindrome("mayamoodybabydoomayam");
		Test1.isPalindrome("supercalifragilisticexpialidocious");
		Test1.isPalindrome("DocNoteIDissentAFastNeverPreventsAFatnessIDietOnCod");
		
		
		
		
		
	}
}
