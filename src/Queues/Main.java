package Queues;
import Queues.ArrayQueue;

public class Main {
    public static void main(String[] args){
        ArrayQueue<String> myList = new ArrayQueue<>();
        myList.enqueue("abc");
        myList.enqueue("def");
        myList.enqueue("abcd");
        myList.enqueue("dafe");
        myList.enqueue("acv");
        myList.enqueue("acv");
        myList.enqueue("acv");
        myList.enqueue("acv");
        myList.enqueue("acv");
        myList.enqueue("acv");
        myList.enqueue("acv");
        myList.enqueue("acv");
        myList.dequeue();
        myList.dequeue();
        myList.enqueue("acv");
        myList.enqueue("acv");

    }

}
