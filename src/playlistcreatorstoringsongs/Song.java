package playlistcreatorstoringsongs;

public class Song {
    // write code here
    private String title;
    private double duration;

    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return this.title;
    }

    @Override
    public String toString() {
        return String.format("%s:%.2f", title, duration);
    }

}
