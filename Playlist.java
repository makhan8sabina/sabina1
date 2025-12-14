public class Playlist{
    private String name;
    private int songCount;
    public Playlist(String name,int songCount){
        this.name=name;
        this.songCount=songCount;
    }
    public String getName(){
        return name;
    }
    public int getSongCount(){
        return songCount;
    }
    public void setSongCount(int songCount){
        this.songCount=songCount;
    }
    public void show(){
        System.out.println("Playlist: "+name+" ("+songCount+")");
    }
}