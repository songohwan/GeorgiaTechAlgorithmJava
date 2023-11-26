package LinkedList;

public class main_iterable {

    public static void main(String[] args) {
        bookListsIterable BookLists = new bookListsIterable();
        BookLists.addBook(new Books("Nassim", "Jayden"));
        BookLists.addBook(new Books("Nassim2", "Jayden2"));


        // Iterate through the playlist using the enhanced for loop
        for (Books book : BookLists) {
            System.out.println(book.author + ": " + book.title);
        }
    }

}
