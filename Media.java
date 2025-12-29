import java.util.Objects;
public abstract class Media {
    protected String title;
    protected int duration;

    public Media(String title, int duration){
    this.title=title;
    this.duration=duration;
    }
    public String getTitle(){
        return title;
    }
    public int getDuration(){
        return duration;
    }
    public abstract void play();
    public String toString(){
        return "Title: " + title + ", Duration: " + duration + " sec";
    }
    public boolean equals(Object o){
        if(this==o) return true;
        if (!(o instanceof Media)) return false;
        Media media=(Media) o;
        return duration == media.duration && Objects.equals(title, media.title);
    }
    public int hashCode(){
        return Objects.hash(title, duration);
    }
}