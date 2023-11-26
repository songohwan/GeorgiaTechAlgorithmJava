package main;

class book {
    String title;
    String author;

    String genre;

    public book(String title, String author, String genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
    }
}

class NodePractice {
    book data;
    NodePractice next;

    public NodePractice(book data) {
        this.data = data;
        this.next = null;
    }
}

class bookPlayList {
    NodePractice head;
    public bookPlayList() {
        this.head = null;
    }


    public void addBooks(String Title, String Author, String genre) {
        book newBook = new book(Title, Author, genre);
        NodePractice newNode = new NodePractice(newBook);


        if (head == null) {
            head = newNode;
        } else {
            NodePractice currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
//            Link to define next node
            currentNode.next = newNode;
        }
    }

    public void addBooksIndex(String Title, String Author, String genre, int Index) {
        book newBook = new book(Title, Author, genre);
        NodePractice newNode = new NodePractice(newBook);

        int i = length();

        System.out.println(i);
//
//        if (head == null) {
//            head = newNode;
//        } else {
//            main.NodePractice currentNode = head;
//
//            while (currentNode.next != null) {
//                currentNode = currentNode.next;
//            }
//            currentNode.next = newNode;
//        }
    }


    public int length(){
        NodePractice currentNode = head;
        int i = 0;
        while (currentNode != null){
            i ++;
            currentNode = currentNode.next;
        }
        return i;
    }


    public void displayBooks() {
        NodePractice currentNode = head;
        while (currentNode != null) {
            System.out.println("Title: " + currentNode.data.title + ", Artist: " + currentNode.data.author + ", Artist: " + currentNode.data.genre);
            currentNode = currentNode.next;
        }
    }
}


public class bookLists {
    public static void main(String[] args) {
        bookPlayList bookPlayList = new bookPlayList();
        bookPlayList.addBooks("Black Swan", "Nassim Taleb", "Philosophy");
        bookPlayList.addBooks("King Arthur", "Random Guy", "Literature");
        bookPlayList.addBooks("Mac Book", "Nassim Taleb", "Tech");
        bookPlayList.addBooks("How not to fail", "Jayden", "Personal Development");
        bookPlayList.displayBooks();

    }
}