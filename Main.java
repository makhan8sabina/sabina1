public class Main {
    public static void main(String[] args) {

        Artist a1 = new Artist("Ali Okapov");
        Artist a2 = new Artist("Sia feat. Sean Paul");

        Song s1 = new Song("Bile", 246, a1);
        Song s2 = new Song("Cheap Thrills", 225, a2);

        Playlist playlist = new Playlist("My Playlist");

        playlist.addMedia(s1);
        playlist.addMedia(s2);

        System.out.println("Play all media:");
        playlist.playAll();

        System.out.println("\nMedia longer than 230 seconds:");
        playlist.showLongMedia(230);

        System.out.println("\nSorted by duration:");
        playlist.sortByDuration();
        playlist.showLongMedia(0);
    }
}