package HashMap;

import bstRemoveAdd.BST;

public class Main {
    public static void main(String[] args){
        ExternalChainingHashMap<Integer, String> myMap = new ExternalChainingHashMap<>();
        myMap.put(6, "abc");
        myMap.put(19, "abc");
        myMap.put(32, "abc");
        myMap.put(6, "def");
        myMap.put(7, "def");
        System.out.println("finished");

    }

}