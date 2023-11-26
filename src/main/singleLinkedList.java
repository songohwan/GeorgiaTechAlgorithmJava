package main;

public class singleLinkedList {
    private static class Node {
        private int data;
        private Node next;

        private Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
        private Node(int data){this (data, null);}
    }


    private Node head;
    public void addTofront(int data){
      Node newNode = new Node(data);
      head = newNode;
      newNode.next = head;
    };



}