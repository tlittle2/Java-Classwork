/**
 * 
 * @author Trevor Little
 * @version 3/31/19
 * This is the Queue class.
 * @param <E>- E represents a parameterized type that can be set later by the class that implements it.
 */
public interface Queue<E> {
    
/**
*   @return true if there are no elements in the queue, false otherwise
*/
    default boolean isEmpty() {
      return size() == 0;
    }
    
/**
*   @return the number of elements in the queue
*/
    int size();

/**
*   @return the front element in the queue
*   @throws EmptyCollectionException
*/
    E peek();
    
/**
*   Adds an element to the rear of the queue.
*   @param element an element to place at the rear of the queue
*/
    boolean enqueue(E element);

/**
*   Removes and returns the front element of the queue.
*   @return the element at the front of the queue
*   @throws EmptyCollectionException
*/  
    E dequeue();

/**
*   Removes all elements from the queue.
*/
    default boolean clear() {
      while (!isEmpty()) {
        dequeue();
      }
      return true;
    }

}
