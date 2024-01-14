package BinaryTrees;

/*
Udemy Algorithm Recursive Calls : Factorials reference
 */

public class factorials {
    public static void main(String[] args) {
        int n = 10; // Example, you can change this value or take input from user
        System.out.println("Factorial of " + n + " is: " + factorial(n));
    }

    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + factorial(n - 1);
        }
    }

}