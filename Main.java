public class Main{
    public static void main(String[] args) {
        Artist a1 = new Artist("Ali Okapov");
        Artist a2 = new Artist("Sia feat. Sean Paul");
        Artist a3 = new Artist("Brent Faiyaz");

        Song s1 = new Song("Bile", 246, a1);
        Song s2 = new Song("Cheap Thrills", 225, a2);
        Song s3 = new Song("Best time", 85, a3);

        Playlist p1 = new Playlist("Арманға", 14);
        Playlist p2 = new Playlist("This is acting", 19);
        Playlist p3 = new Playlist(" Larger Than Life", 14);

        a1.show();
        a2.show();
        a3.show();

        s1.show();
        s2.show();
        s3.show();

        p1.show();
        p2.show();
        p3.show();

        if (p1.getSongCount() > p2.getSongCount()) {
            System.out.println("album"+" _ " + p1.getName() + " _ " + "has more songs");
        } else {
            System.out.println("album"+" _ " + p2.getName() + " _ " + " has more songs");
        }
    }
}