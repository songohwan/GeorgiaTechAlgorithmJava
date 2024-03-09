package AVLTrees;


public class Main {
    public static void main(String[] args){
        AVL <Integer> myAVL = new AVL<>();
        myAVL.add(50);
        myAVL.add(12);
        myAVL.add(8);
        myAVL.add(68);
        myAVL.add(60);
        myAVL.add(30);
        myAVL.remove(60);

        System.out.println("Test Complete");

    }

}
