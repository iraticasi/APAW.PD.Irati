package music.models;

import java.time.LocalDateTime;

public class Song {

    private String id;

    private String name;

    private String singer;

    private int seconds;

    private LocalDateTime date;

    private Genre genre;

    public Song(String id, String name) {
        assert id != null;
        assert name != null;
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSinger() {
        return singer;
    }

    public int getSeconds() {
        return seconds;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }
}
