/**
 * 
 * @author Trevor Little
 *@version 4/10/19
 *This is the TestLinkedList for Lab10
 * 
 */
public class TestLinkedList <E>{

	private Node head;
	
	private Node tail;
	
	private class Node{
		private E data;
		private Node next;
		
		private Node(E data, Node next) {
			this.data= data;
			this.next= next;
		}
		private Node(E data) {
			this(data, null);
		}
		private Node(){
			this(null, null);
		}
	}
	
	public TestLinkedList() {
		this.head= new Node();
		tail= head;
		
	}
	
	
	public void add(E item) {
		head.next= new Node(item, head.next);
		if(head == tail) tail =  head.next;
	}
	
	/**
	 * Returns the size of the linked list (i.e. the number of elements in it).
	 * MUST BE RECURSIVE
	 */
	public int size(){
		//TO DO: Complete the body of this method
		
		if(head.next == null) {
			return 0;
		}else {
			return size(head.next) + 1;
		}
		
	}

	public int size(Node current){
		//TO DO: Complete the body of this method
		
		if(current.next == null) {
			return 0;
		}else {
			return size(current.next) + 1;
		}
		
	}
	
	/**
	 * Extends this list by joining the elements of list2 to its end
	 * This method NEED NOT be recursive
	 * 
	 */
	
	public void concat(TestLinkedList<E> list2) {
		//TO DO: Complete the body of this method
		
		if(list2.head.next != null) {
			
			tail.next= list2.head.next;
			this.tail = list2.tail;
			
			
			 
	
		}
		
		
	
	}
	
	@Override
	public String toString() {
		if (head== tail ) return "[ ]";
		StringBuilder sb= new StringBuilder("[");
		Node current = head.next;
		while(current.next != null) {
			sb.append(current.data + ", ");
			current= current.next;
		}
		sb.append(current.data + "]\n");
		return sb.toString();
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		TestLinkedList<String> listA= new TestLinkedList<>();
		TestLinkedList<String> listB= new TestLinkedList<>();
		
		listA.add("three");
		listA.add("two");
		listA.add("one");
		System.out.println("List A: " + listA);
		listB.add("six");
		listB.add("five");
		listB.add("four");
		System.out.println("List B: " + listB);
		listA.concat(listB);
		System.out.println("Concatenated lists: " + listA);
		
	}

}
