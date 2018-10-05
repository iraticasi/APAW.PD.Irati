package music.models;

import java.util.List;

public class SongFile extends File{

    Song song;

    public SongFile(Song song) {
        super(song.getName());
        this.song = song;
    }

    @Override
    public void add(File file) {
        throw new UnsupportedOperationException("Operación no soportada");
    }

    @Override
    public void remove(File file) {
        throw new UnsupportedOperationException("Operación no soportada");

    }

    @Override
    public boolean isFolder() {
        return false;
    }

    @Override
    public String view() {
        return this.song.getId();
    }

    @Override
    public List<File> listFiles() {
        return null;
    }

    public Song getSong(){
        return this.song;
    }
}
