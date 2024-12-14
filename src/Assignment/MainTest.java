package Assignment;

public class MainTest {
    public static void main(String[] args){
        SinglyLinkedList<String> myList = new SinglyLinkedList<>();
        myList.addToFront("ABC");
        myList.addToBack("DEFG");
        myList.addToFront("DEFGdfadfa");
        myList.displayData();
    }

}
