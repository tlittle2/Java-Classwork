/**
 * 
 * @author Trevor Little
 * @version 4/19/19
 * This is the Deque interface provided by professor Sheaffer that gives a skeleton of the methods that should be implemented
 * @param <E> is a parameterized type
 */
public interface Deque<E> {
  /**
  * The deque (double-ended queue) provides methods for inserting, deleting
  * and getting either the first or last element of a sequence of elements.
  */

  /**
  * Adds a new element to the head of this deque.
  * @param element the element to insert at the head of this deque
  */
  public void addFirst(E element);

  /**
  * Removes and returns the head element of this deque.
  * @return the head element of this deque
  * @throws NoSuchElementException if this deque is empty
  */
  public E removeFirst();

  /**
  * @return the head element of this deque
  * @throws NoSuchElementException if this deque is empty
  */
  public E getFirst();

  /**
  * Removes the first occurrence of a given object.
  * @param obj the object to be removed from this deque.
  * @return true if the given object is removed, false otherwise
  */
  public boolean removeFirstOccurrence(Object obj);

  /**
  * Adds a new element to the tail of this deque.
  * @param element the element to insert at the tail of this deque
  */
  public void addLast(E element);

  /**
  * Removes and returns the tail element of this deque.
  * @return the tail element of this deque
  * @throws NoSuchElementException if this deque is empty
  */
  public E removeLast();

  /**
  * @return the tail element of this deque
  * @throws NoSuchElementException if this deque is empty
  */
  public E getLast();

  /**
  * Removes the last occurrence of a given object.
  * @param obj the object to be removed from this deque.
  * @return true if the given object is removed, false otherwise
  */
  public boolean removeLastOccurrence(Object obj);
}