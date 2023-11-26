package LinkedList;

class Song {
    String title;
    String artist;

    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }
}

class Node {
    Song data;
    Node next;

    public Node(Song data) {
        this.data = data;
        this.next = null;
    }
}

class Playlist {
    Node head;

    public Playlist() {
        this.head = null;
    }

    public void addSong(String title, String artist) {
        Song newSong = new Song(title, artist);
        Node newNode = new Node(newSong);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void displayPlaylist() {
        Node current = head;
        while (current != null) {
            System.out.println("Title: " + current.data.title + ", Artist: " + current.data.artist);
            current = current.next;
        }
    }
}

public class SSL {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();

        // Adding songs to the playlist
        playlist.addSong("main.Song 1", "Artist 1");
        playlist.addSong("main.Song 2", "Artist 2");
        playlist.addSong("main.Song 3", "Artist 3");

        // Displaying the playlist
        playlist.displayPlaylist();
    }
}
