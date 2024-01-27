package bstRemoveAdd;

import java.util.NoSuchElementException;

/**
 * Your implementation of a BST.
 */
public class BST<T extends Comparable<? super T>> {

    /*
     * Do not add new instance variables or modify existing ones.
     */
    private BSTNode<T> root;
    private int size;

    /*
     * Do not add a constructor.
     */

    /**
     * Adds the data to the tree.
     * <p>
     * This must be done recursively.
     * <p>
     * The new data should become a leaf in the tree.
     * <p>
     * Traverse the tree to find the appropriate location. If the data is
     * already in the tree, then nothing should be done (the duplicate
     * shouldn't get added, and size should not be incremented).
     * <p>
     * Should be O(log n) for best and average cases and O(n) for worst case.
     *
     * @param data The data to add to the tree.
     * @throws java.lang.IllegalArgumentException If data is null.
     */
    public void add(T data) {
        // WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
        if (data == null) {
            throw new IllegalArgumentException("Data Cannot be null");
        }

//        BSTNode<T> current = root;
        if (root == null) {
            root = new BSTNode<>(data);
        } else {
            addRecursive(root, data);
        }
    }

    private void addRecursive(BSTNode<T> node, T data) {
        int comparison = data.compareTo(node.getData());
        if (comparison < 0) {
            if (node.getLeft() == null) {
                node.setLeft(new BSTNode<>(data));
            } else {
                addRecursive(node.getLeft(), data);
            }
        } else if (comparison > 0) {
            if (node.getRight() == null) {
                node.setRight(new BSTNode<>(data));
            } else {
                addRecursive(node.getRight(), data);
            }
        }
    }
    /**
     * Removes and returns the data from the tree matching the given parameter.
     *
     * This must be done recursively.
     *
     * There are 3 cases to consider:
     * 1: The node containing the data is a leaf (no children). In this case,
     * simply remove it.
     * 2: The node containing the data has one child. In this case, simply
     * replace it with its child.
     * 3: The node containing the data has 2 children. Use the SUCCESSOR to
     * replace the data. You should use recursion to find and remove the
     * successor (you will likely need an additional helper method to
     * handle this case efficiently).
     *
     * Do NOT return the same data that was passed in. Return the data that
     * was stored in the tree.
     *
     * Hint: Should you use value equality or reference equality?
     *
     * Must be O(log n) for best and average cases and O(n) for worst case.
     *
     * @param data The data to remove.
     * @return The data that was removed.
     * @throws java.lang.IllegalArgumentException If data is null.
     * @throws java.util.NoSuchElementException   If the data is not in the tree.
     */
    public T remove(T data) {
        // WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
        if (data == null) {
            throw new IllegalArgumentException("Data cannot be null");
        }


        if (root == null) {
            return null; // Tree is empty, nothing to remove
        }

        BSTNode<T> removed = new BSTNode<>(null); // Helper node to store removed data
        root = removeRecursive(root, data, removed);

        if (removed.getData() != null) {
            size--; // Decrement size if something was removed
        }
        return removed.getData();
    }

    private BSTNode<T> removeRecursive(BSTNode<T> node, T data, BSTNode<T> removed) {
        if (node == null) {
            return null;
        }

        int comparison = data.compareTo(node.getData());
        if (comparison < 0) {
            node.setLeft(removeRecursive(node.getLeft(), data, removed));
        } else if (comparison > 0) {
            node.setRight(removeRecursive(node.getRight(), data, removed));
        } else {
            // Node found, store the data to be returned
            removed.setData(node.getData());

            // Handle different cases of removal
            if (node.getLeft() == null && node.getRight() == null) {
                return null; // Node is a leaf
            } else if (node.getLeft() == null) {
                return node.getRight(); // Node has only right child
            } else if (node.getRight() == null) {
                return node.getLeft(); // Node has only left child
            } else {
                // Node has two children
                T replacement = findMin(node.getRight());
                node.setData(replacement);
                node.setRight(removeRecursive(node.getRight(), replacement, new BSTNode<>(null)));
            }
        }
        return node;
    }

    private T findMin(BSTNode<T> node) {
        while (node.getLeft() != null) {
            node = node.getLeft();
        }
        return node.getData();
    }

    /**
     * Returns the root of the tree.
     * <p>
     * For grading purposes only. You shouldn't need to use this method since
     * you have direct access to the variable.
     *
     * @return The root of the tree
     */
    public BSTNode<T> getRoot() {
        // DO NOT MODIFY THIS METHOD!
        return root;
    }

    /**
     * Returns the size of the tree.
     * <p>
     * For grading purposes only. You shouldn't need to use this method since
     * you have direct access to the variable.
     *
     * @return The size of the tree
     */
    public int size() {
        // DO NOT MODIFY THIS METHOD!
        return size;
    }
}