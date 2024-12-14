package LinkedList;

import java.util.Iterator;

class Books {
    String title;
    String author;

    public Books(String title, String author) {
        this.title = title;
        this.author = author;
    }
}

class bookListsIterable implements Iterable<Books> {
    private Node head;

    private class Node {
        Books book;
        Node next;

        Node(Books book) {
            this.book = book;
        }
    }

    public void addBook(Books book) {
        Node newNode = new Node(book);
        newNode.next = head;
        head = newNode;
    }




    @Override
    public Iterator<Books> iterator() {
        return new Iterator<Books>() {
            private Node current = head;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public Books next() {
                Books book = current.book;
                current = current.next;
                return book;
            }
        };
    }
}

