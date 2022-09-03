import java.util.LinkedList;

class App {
    public static void main(String[] args) {

        // Creates a new Linkedlist Object
        LinkedList<String> Playlist = new LinkedList<>();

        // Adds new songs to Playlist
        Playlist.add("Lay Me Down");
        Playlist.add("All I Ask");
        Playlist.add("Glimpse of Us");
        Playlist.add("Rainbow");
        Playlist.add("When I Met You");

        // Adds a new song at the front of the Playlist
        Playlist.addFirst("So Sick");

        // Adds a new song at the end of the Playlist
        Playlist.addLast("Jealous");

        // Display node at the front in the LinkedList
        System.out.println(Playlist.get(0));

        // Replace the last song using the set() method
        Playlist.set(6, "Can't Help Falling In Love");

        // Remove the first song using the remove() method
        Playlist.remove(0);

        // Display all songs in Playlist
        System.out.println("Updated playlist: " + Playlist);
    }
}

