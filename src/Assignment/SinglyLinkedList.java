package Assignment;

import java.util.NoSuchElementException;

/**
 * Your implementation of a Singly-Linked List.
 */
public class SinglyLinkedList<T> {

    /*
     * Do not add new instance variables or modify existing ones.
     */
    private SinglyLinkedListNode<T> head;
    private SinglyLinkedListNode<T> tail;
    private int size;

    /*
     * Do not add a constructor.
     */

    /**
     * Adds the element to the front of the list.
     * <p>
     * Method should run in O(1) time.
     *
     * @param data the data to add to the front of the list
     * @throws java.lang.IllegalArgumentException if data is null
     */
    public void addToFront(T data) {
        // WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
        SinglyLinkedListNode<T> newNode = new SinglyLinkedListNode<>(data);
        newNode.setNext(head);
        head = newNode;

        if (size == 0) {
            // If the list was empty, the new node is also the tail
            tail = newNode;
        }

        size++;

    }

    /**
     * Adds the element to the back of the list.
     * <p>
     * Method should run in O(1) time.
     *
     * @param data the data to add to the back of the list
     * @throws java.lang.IllegalArgumentException if data is null
     */
    public void addToBack(T data) {
        // WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
        if (data == null) {
            throw new IllegalArgumentException("Data cannot be null");
        }

        SinglyLinkedListNode<T> newNode = new SinglyLinkedListNode<>(data);

        if (size == 0) {
            // If the list was empty, the new node is both the head and the tail
            head = newNode;
            tail = newNode;
        } else {
            // Otherwise, update the next pointer of the current tail and set the new node as the tail
            tail.setNext(newNode);
            tail = newNode;
        }

        size++;


    }

    /**
     * Removes and returns the first data of the list.
     * <p>
     * Method should run in O(1) time.
     *
     * @return the data formerly located at the front of the list
     * @throws java.util.NoSuchElementException if the list is empty
     */
    public T removeFromFront() {
        // WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
        if (size == 0) {
            throw new NoSuchElementException("List is empty");
        }

        T removedData = head.getData();
        head = head.getNext();

        if (size == 1) {
            // If there was only one element, update the tail as well
            tail = null;
        }

        size--;
        return removedData;


    }

    /**
     * Removes and returns the last data of the list.
     * <p>
     * Method should run in O(n) time.
     *
     * @return the data formerly located at the back of the list
     * @throws java.util.NoSuchElementException if the list is empty
     */
    public T removeFromBack() {
        // WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
        if (size == 0) {
            throw new NoSuchElementException("List is empty");
        }

        T removedData;
        if (size == 1) {
            // If there is only one element, remove it and update both head and tail
            removedData = head.getData();
            head = null;
            tail = null;
        } else {
            // Otherwise, traverse the list to find the node before the tail
            SinglyLinkedListNode<T> current = head;
            while (current.getNext() != tail) {
                current = current.getNext();
            }

            removedData = tail.getData();
            current.setNext(null);
            tail = current;
        }

        size--;
        return removedData;
    }

    /**
     * Returns the head node of the list.
     * <p>
     * For grading purposes only. You shouldn't need to use this method since
     * you have direct access to the variable.
     *
     * @return the node at the head of the list
     */
    public SinglyLinkedListNode<T> getHead() {
        // DO NOT MODIFY THIS METHOD!
        return head;
    }

    /**
     * Returns the tail node of the list.
     * <p>
     * For grading purposes only. You shouldn't need to use this method since
     * you have direct access to the variable.
     *
     * @return the node at the tail of the list
     */
    public SinglyLinkedListNode<T> getTail() {
        // DO NOT MODIFY THIS METHOD!
        return tail;
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
}