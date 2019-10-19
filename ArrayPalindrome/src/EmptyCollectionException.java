/**
 * 
 * @author Trevor Little
 * @version 3/1/19
 * This is the EmptyCollectionException class that defines what will happen if the program detects an empty stack.
 */
public class EmptyCollectionException extends RuntimeException {

    public EmptyCollectionException(String collection) {
        super("The collection " + collection + " is empty.");
    }

}