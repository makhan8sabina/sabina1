public class Song{
    private String title;
    private int duration;
    private Artist artist;
    public Song(String title, int duration, Artist artist){
        this.title=title;
        this.duration=duration;
        this.artist=artist;
    }
    public String getTitle(){
        return title;
    }
    public int getDuration() {
        return duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }
    public void show(){
        System.out.println("Song: "+title+" (by "+artist.getName()+ ") ("+duration+"sec)");
    }
}