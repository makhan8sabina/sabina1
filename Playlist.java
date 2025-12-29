import java.util.ArrayList;
import java.util.Comparator;

public class Playlist {
    private String name;
    private ArrayList<Media> mediaList;

    public Playlist(String name) {
        this.name = name;
        this.mediaList = new ArrayList<>();
    }

    public void addMedia(Media m) {
        mediaList.add(m);
    }

    public void playAll() {
        for (Media m : mediaList) {
            m.play();
        }
    }

    public void showLongMedia(int minDuration) {
        for (Media m : mediaList) {
            if (m.getDuration() > minDuration) {
                System.out.println(m);
            }
        }
    }
    public void searchByTitle(String keyword){
        for(Media m:mediaList){
            if (m.getTitle().toLowerCase().contains(keyword.toLowerCase())){
                System.out.println(m);
            }
        }
    }

    public void sortByDuration() {
        mediaList.sort(Comparator.comparing(Media::getDuration));
    }
}
