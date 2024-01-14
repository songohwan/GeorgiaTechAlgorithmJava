package BinaryTrees;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Your implementation of the pre-order, in-order, and post-order
 * traversals of a tree.
 */
public class Traversals<T extends Comparable<? super T>> {

    /**
     * DO NOT ADD ANY GLOBAL VARIABLES!
     */

    /**
     * Given the root of a binary search tree, generate a
     * pre-order traversal of the tree. The original tree
     * should not be modified in any way.
     *
     * This must be done recursively.
     *
     * Must be O(n).
     *
     * @param <T> Generic type.
     * @param root The root of a BST.
     * @return List containing the pre-order traversal of the tree.
     */
    public List<T> preorder(TreeNode<T> root) {
        // WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
        List<T> result = new ArrayList<>();
        if (root == null){
            return result;
        }


        result.add(root.getData());

//        for some reason, if you don't use addAll method, it returns only root node (e.g. 10 in this program)

        if (root.getLeft() != null){
            result.addAll(preorder(root.getLeft()));
        };


        if (root.getRight() != null){
            result.addAll(preorder(root.getRight()));
        }

        return result;
    }

    /**
     * Given the root of a binary search tree, generate an
     * in-order traversal of the tree. The original tree
     * should not be modified in any way.
     *
     * This must be done recursively.
     *
     * Must be O(n).
     *
     * @param <T> Generic type.
     * @param root The root of a BST.
     * @return List containing the in-order traversal of the tree.
     */
    public List<T> inorder(TreeNode<T> root) {
        // WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
        List<T> result = new ArrayList<>();

        if (root == null){
            return result;
        }

//        for some reason, if you don't use addAll method, it returns only root node (e.g. 10 in this program)

        if (root.getLeft() != null){
            result.addAll(inorder(root.getLeft()));
        };

        result.add(root.getData());

        if (root.getRight() != null){
            result.addAll(inorder(root.getRight()));
        }

        return result;
    }




    /**
     * Given the root of a binary search tree, generate a
     * post-order traversal of the tree. The original tree
     * should not be modified in any way.
     *
     * This must be done recursively.
     *
     * Must be O(n).
     *
     * @param <T> Generic type.
     * @param root The root of a BST.
     * @return List containing the post-order traversal of the tree.
     */
    public List<T> postorder(TreeNode<T> root) {
        // WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
        List<T> result = new ArrayList<>();

//        for some reason, if you don't use addAll method, it returns only root node (e.g. 10 in this program)
        if (root == null){
            return result;
        }
        if (root.getLeft() != null){
            result.addAll(postorder(root.getLeft()));
        };

        if (root.getRight() != null){
            result.addAll(postorder(root.getRight()));
        }

        result.add(root.getData());

        return result;
    }
}