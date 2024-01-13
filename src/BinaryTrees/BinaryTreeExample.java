package BinaryTrees;
import java.util.List;

public class BinaryTreeExample {
    public static void main(String[] args) {
        // Create nodes
        TreeNode<Integer> root = new TreeNode<>(10);
        TreeNode<Integer> node5 = new TreeNode<>(5);
        TreeNode<Integer> node15 = new TreeNode<>(15);
        TreeNode<Integer> node3 = new TreeNode<>(3);
        TreeNode<Integer> node7 = new TreeNode<>(7);
        TreeNode<Integer> node12 = new TreeNode<>(12);
        TreeNode<Integer> node17 = new TreeNode<>(17);

        // Construct the tree
        root.setLeft(node5);
        root.setRight(node15);
        node5.setLeft(node3);
        node5.setRight(node7);
        node15.setLeft(node12);
        node15.setRight(node17);

        // Now the tree is constructed with root at 10
        //        10
        //       /  \
        //      5    15
        //     / \   / \
        //    3   7 12  17

        Traversals<Integer> traversals = new Traversals<>();
        List<Integer> preorderResult = traversals.preorder(root);

        System.out.println("Test" + preorderResult);

    }
}