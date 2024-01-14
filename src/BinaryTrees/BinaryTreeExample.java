package BinaryTrees;
import java.util.List;

public class BinaryTreeExample {
    public static void main(String[] args) {
        // Create nodes
        TreeNode<Integer> root = new TreeNode<>(6);
        TreeNode<Integer> node1 = new TreeNode<>(1);
        TreeNode<Integer> node2 = new TreeNode<>(2);
        TreeNode<Integer> node9 = new TreeNode<>(9);
        TreeNode<Integer> node5 = new TreeNode<>(5);
        TreeNode<Integer> node11 = new TreeNode<>(11);
        TreeNode<Integer> node4 = new TreeNode<>(4);
        TreeNode<Integer> node3 = new TreeNode<>(3);
        TreeNode<Integer> node10 = new TreeNode<>(10);
        TreeNode<Integer> node8 = new TreeNode<>(8);
        TreeNode<Integer> node7 = new TreeNode<>(7);


        // Construct the tree
        root.setLeft(node1);
        root.setRight(node2);
        node1.setLeft(node9);
        node9.setRight(node11);
        node11.setRight(node4);
        node1.setRight(node5);
        node2.setLeft(node3);
        node2.setRight(node10);
        node3.setLeft(node8);
        node8.setRight(node7);
        node2.setRight(node10);


        // Now the tree is constructed with root at 10
        //        10
        //       /  \
        //      5    15
        //     / \   / \
        //    3   7 12  17

        Traversals<Integer> traversals = new Traversals<>();
        List<Integer> inorderResult = traversals.postorder(root);

        System.out.println("Test" + inorderResult);

    }
}