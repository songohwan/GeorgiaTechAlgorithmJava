import java.util.NoSuchElementException;


/**
 * Your implementation of an ArrayList.
 */
public class ArrayList<T> {

    /*
     * The initial capacity of the ArrayList.
     *
     * DO NOT MODIFY THIS VARIABLE!
     */
    public static final int INITIAL_CAPACITY = 9;

    /*
     * Do not add new instance variables or modify existing ones.
     */
    private T[] backingArray;
    private int size;

    /**
     * This is the constructor that constructs a new ArrayList.
     * <p>
     * Recall that Java does not allow for regular generic array creation,
     * so instead we cast an Object[] to a T[] to get the generic typing.
     */
    public ArrayList() {
        //DO NOT MODIFY THIS METHOD!
        backingArray = (T[]) new Object[INITIAL_CAPACITY];
    }

    /**
     * Adds the data to the front of the list.
     * <p>
     * This add may require elements to be shifted.
     * <p>
     * Method should run in O(n) time.
     *
     * @param data the data to add to the front of the list
     * @throws java.lang.IllegalArgumentException if data is null
     */
    public void addToFront(T data) {
        // WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
        if (data == null) {
            throw new IllegalArgumentException("Data Cannot be null");
        }
        ;

        int i = backingArray.length - 1;

        while (i > 0) {
            backingArray[i] = backingArray[i - 1];
            i--;
        }
        backingArray[0] = data;
    }


//        [a,b,c,d]
//


    /**
     * Adds the data to the back of the list.
     * <p>
     * Method should run in amortized O(1) time.
     *
     * @param data the data to add to the back of the list
     * @throws java.lang.IllegalArgumentException if data is null
     */
    public void addToBack(T data) {
        // WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
        if (data == null) {
            throw new IllegalArgumentException("Data Cannot be null");
        }
        ;

        T removedata = null;


        for (int i = backingArray.length - 1; i >= 0; i--) {
            if (backingArray[i] != null) {

                removedata = backingArray[i];

                backingArray[i] = null;
                break;
            }
        }

        return removedata;

    }

    /**
     * Removes and returns the first data of the list.
     * <p>
     * Do not shrink the backing array.
     * <p>
     * This remove may require elements to be shifted.
     * <p>
     * Method should run in O(n) time.
     *
     * @return the data formerly located at the front of the list
     * @throws java.util.NoSuchElementException if the list is empty
     */
    public T removeFromFront() {
        // WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
        if (backingArray[0] == null) {
            throw new IllegalArgumentException("Data Cannot be null");
        }
        ;

        T removeData = backingArray[0];
        for (int i = 0; i < backingArray.length - 1; i++) {
            backingArray[i] = backingArray[i + 1];
        }
        return removeData;
    }

    /**
     * Removes and returns the last data of the list.
     * <p>
     * Do not shrink the backing array.
     * <p>
     * Method should run in O(1) time.
     *
     * @return the data formerly located at the back of the list
     * @throws java.util.NoSuchElementException if the list is empty
     */
    public T removeFromBack() {
        // WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
        if (backingArray[0] == null) {
            throw new IllegalArgumentException("Data Cannot be null");
        }


        T removedata = null;


        for (int i = backingArray.length - 1; i >= 0; i--) {
            if (backingArray[i] != null) {

                removedata = backingArray[i];

                backingArray[i] = null;
                break;
            }
        }

        return removedata;
//        remove the last data

    }

    /**
     * Returns the backing array of the list.
     * <p>
     * For grading purposes only. You shouldn't need to use this method since
     * you have direct access to the variable.
     *
     * @return the backing array of the list
     */
    public T[] getBackingArray() {
        // DO NOT MODIFY THIS METHOD!
        return backingArray;
    }

    /**
     * Returns the size of the list.
     * <p>
     * For grading purposes only. You shouldn't need to use this method since
     * you have direct access to the variable.
     *
     * @return the size of the list
     */
    public int size() {
        // DO NOT MODIFY THIS METHOD!
        return size;
    }

    public static void main(String[] args) {
        ArrayList<Integer> debugList = new ArrayList<>();
        debugList.addToFront(0);
        debugList.addToFront(2);
        debugList.addToFront(3);
        debugList.addToBack(4);
        debugList.removeFromFront();


    }

}