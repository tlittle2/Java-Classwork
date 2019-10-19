
import java.util.NoSuchElementException;

/**
 * 
 * @author Trevor Little
 * @version 4/19/19
 * This is the LinkedDeque class and its methods
 * @param <E> is a parameterized type
 */


public class LinkedDeque<E> implements Deque<E> {

  private static class DNode<E> {

    private E data;
    private DNode<E> previous;
    private DNode<E> next;

    public DNode(E data, DNode<E> previous, DNode<E> next) {
      this.data = data;
      this.previous = previous;
      this.next = next;
    }

    public DNode(E data) {
      this(data, null, null);
    }

    public DNode() {
      this(null, null, null);
    }
  }

  private DNode<E> head;
  private DNode<E> tail;
  
  private int size;

// Creates both a dummy head and a dummy tail.
  public LinkedDeque() {
    head = new DNode<>();
    tail = new DNode<>();
    head.next = tail;
    tail.previous = head;
    size = 0;
  }

  public boolean isEmpty() {
    return head.next == tail;
  }

  public void clear() {
    head.next = tail;
    tail.previous = head;
  }

// Complete the following methods:
  

  public void addFirst(E element) {
	 DNode<E> newNode= new DNode<E>(element);
	 
	 DNode<E> oldHN= head.next;
	 
	 head.next= newNode;
	 
	 oldHN.previous = newNode;
	  

	 newNode.previous= head;
	 
	 newNode.next= oldHN;
	 
	 size++;

  }

  public E removeFirst() {
	  
	
	  
	  if(head.next== tail) {
		  throw new NoSuchElementException("ArrayDeque is empty");
	  }else {
		  
		  DNode<E>newNextNode= head.next.next;
		  DNode<E>oldNextNode= head.next; 
	  head.next= newNextNode;
	  
	  newNextNode.previous= head;
	  
	  size--;
	  
	  return oldNextNode.data;
	  }  
 
  }

  public E getFirst() {
	  if(head.next== tail) {
		  throw new NoSuchElementException("ArrayDeque is empty");
	  }else {
	  
		  return head.next.data;
	  }
	  
  }

  public boolean removeFirstOccurrence(Object obj) {
	  
	  DNode<E> thisNode= head;
	  for(int i =0; i < size; i++) {
		 thisNode= head.next;
		 if(thisNode.data == obj) {
			 thisNode.previous.next= thisNode.next;
			  thisNode.next.previous= thisNode.previous;
			 
			  size--;
			  return true;
		 }
		 
	  }
	  return false;
  }

  public void addLast(E element) {
	  DNode<E> newNode= new DNode<E>(element);
		 
		 DNode<E> oldTP= tail.previous;
		 
		 tail.previous= newNode;
		 
		 newNode.next= tail;
		 
		 newNode.previous= oldTP;
		 
		 oldTP.next= newNode;
		 
		 size++;
	  

  }

  public E removeLast() {
	  
	  if(tail.previous== head) {
		  throw new NoSuchElementException("ArrayDeque is empty");
	  }else {
	  DNode<E>newNextNode= tail.previous.previous;
	  DNode<E>oldNextNode= tail.previous;
	
	  tail.previous= newNextNode;
	  
	  newNextNode.next= tail;
	  
	  size--;
	  
	  return oldNextNode.data;
	  }
	  
  }

  public E getLast() {
	  if(tail.previous== head) {
		  throw new NoSuchElementException("ArrayDeque is empty");
	  }else {
	  
		  return tail.previous.data;
	  }
	  
  }

  public boolean removeLastOccurrence(Object obj) {

	  DNode<E> thisNode= tail;
	  for(int i =size; i > 0; i--) {
		 thisNode= tail.previous;
		 if(thisNode.data == obj) {
			 thisNode.next.previous= thisNode.previous;
			  thisNode.previous.next= thisNode.next;
			 
			  size--;
			  return true;
		 }
		 
	  }
	  return false;
  }

  public void printForward() {
    System.out.println("The deque printed forward:");
    DNode current = head.next;
    while (current != tail) {
      System.out.println(current.data);
      current = current.next;
    }
    System.out.println();
  }

  public void printBackward() {
    System.out.println("The deque printed backward:");
    DNode current = tail.previous;
    while (current != head) {
      System.out.println(current.data);
      current = current.previous;
    }
    System.out.println();
  }

}
