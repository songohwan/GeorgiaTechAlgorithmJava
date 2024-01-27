package Queues;

import java.util.NoSuchElementException;

/**
 * Your implementation of an ArrayQueue.
 */
public class ArrayQueue<T> {

    /*
     * The initial capacity of the ArrayQueue.
     *
     * DO NOT MODIFY THIS VARIABLE.
     */
    public static final int INITIAL_CAPACITY = 9;

    /*
     * Do not add new instance variables or modify existing ones.
     */
    private T[] backingArray;
    private int front;
    private int size;

    /**
     * This is the constructor that constructs a new ArrayQueue.
     * <p>
     * Recall that Java does not allow for regular generic array creation,
     * so instead we cast an Object[] to a T[] to get the generic typing.
     */
    public ArrayQueue() {
        // DO NOT MODIFY THIS METHOD!
        backingArray = (T[]) new Object[INITIAL_CAPACITY];
    }

    /**
     * Adds the data to the back of the queue.
     * <p>
     * If sufficient space is not available in the backing array, resize it to
     * double the current length. When resizing, copy elements to the
     * beginning of the new array and reset front to 0.
     * <p>
     * Method should run in amortized O(1) time.
     *
     * @param data the data to add to the back of the queue
     * @throws java.lang.IllegalArgumentException if data is null
     */
    public void enqueue(T data) {
        // WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
        if (size == backingArray.length) {
            // Array is full, so we need to resize it
            int newCapacity = backingArray.length * 2; // Double the capacity
            T[] newBackingArray = (T[]) new Object[newCapacity];

            // Copy elements from the old array to the new array
            for (int i = 0; i < size; i++) {
                newBackingArray[i] = backingArray[(front + i)];
            }
//
//            // Update front and back pointers
//            front = 0;
//            back = size;

            // Assign the new array as the backingArray
            backingArray = newBackingArray;
        }


        if (data == null){
            throw new IllegalArgumentException("Data is null");
        }
        if (size ==0){
            backingArray[0] = data;
            size ++;
        } else {
            backingArray[size] = data;
            size ++;
        }
    }

    /**
     * Removes and returns the data from the front of the queue.
     * <p>
     * Do not shrink the backing array.
     * <p>
     * Replace any spots that you dequeue from with null.
     * <p>
     * If the queue becomes empty as a result of this call, do not reset
     * front to 0.
     * <p>
     * Method should run in O(1) time.
     *
     * @return the data formerly located at the front of the queue
     * @throws java.util.NoSuchElementException if the queue is empty
     */
    public T dequeue() {
        // WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!

        if (size == 0){
            throw new NoSuchElementException("Queue is empty");
        };
        T element = backingArray[front];
        backingArray[front] = null;
        front ++;
        return element;
    }

    /**
     * Returns the backing array of the queue.
     * <p>
     * For grading purposes only. You shouldn't need to use this method since
     * you have direct access to the variable.
     *
     * @return the backing array of the queue
     */
    public T[] getBackingArray() {
        // DO NOT MODIFY THIS METHOD!
        return backingArray;
    }

    /**
     * Returns the size of the queue.
     * <p>
     * For grading purposes only. You shouldn't need to use this method since
     * you have direct access to the variable.
     *
     * @return the size of the queue
     */
    public int size() {
        // DO NOT MODIFY THIS METHOD!
        return size;
    }
}