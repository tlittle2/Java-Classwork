/**
 * 
 * @author Trevor Little
 * @version 4/19/19
 * This is the Lab_11 Tester class that tests the LinkedDeque.java class.
 */
public class Lab11_Tester {

	public Lab11_Tester() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		LinkedDeque<Integer> l1= new LinkedDeque<Integer>();
		
		l1.addFirst(1);
		
		l1.addLast(2);
		l1.addFirst(3);
		l1.printForward();
		
		System.out.println("The first element in the deque is: "+ l1.getFirst());
		System.out.println("The last element in the deque is: "+ l1.getLast());
		
		System.out.println();
		
		l1.printBackward();
		
		l1.removeFirst();
		l1.printForward();
		
		l1.removeLast();
		l1.printForward();
		
		l1.removeFirst();
		l1.printForward();
		
		l1.removeFirst();
		l1.printForward();
		

	}

}
