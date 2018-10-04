package music.models;

import java.time.LocalDateTime;

public class SongBuilder {

    private Song song;

    public SongBuilder(String id, String name){
        this.song = new Song(id,name);
    }

    public SongBuilder singer(String singer) {
        this.song.setSinger(singer);
        return this;
    }

    public SongBuilder seconds(int seconds) {
        this.song.setSeconds(seconds);
        return this;
    }

    public SongBuilder date(LocalDateTime date) {
        this.song.setDate(date);
        return this;
    }

    public SongBuilder genre(Genre genre) {
        this.song.setGenre(genre);
        return this;
    }

    public Song build(){
        return this.song;
    }
}
