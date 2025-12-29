public class Song extends Media  {
    private Artist artist;
    public Song(String title, int duration, Artist artist){
        super(title, duration);
        this.artist=artist;
    }

    public Artist getArtist() {
        return artist;
    }

    public void play(){
        System.out.println(title + " by " + artist.getName());
    }
    public String toString(){
        return "Song: "+title +" (by "+artist.getName()+ ") ("+ duration +"sec)";
    }
}