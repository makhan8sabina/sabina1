import java.util.Objects;
public class Artist{
    private String name;
    public Artist(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getType(){
        return "Artist";
    }
    public String toString(){
        return "Artist: "+ name;
    }
    public boolean equals (Object o){
        if (this==o) return true;
        if (!(o instanceof Artist)) return false;
        Artist artist = (Artist) o;
        return Objects.equals(name,artist.name);
    }
    public int hashCode(){
        return Objects.hash(name);
    }
}