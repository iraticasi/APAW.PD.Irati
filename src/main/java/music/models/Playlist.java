package music.models;

import java.util.HashSet;
import java.util.Set;

public class Playlist {

    private String id;

    private String name;

    private boolean collaborative;

    private boolean secret;

    private User user;

    private Set<Song> songs;

    public Playlist(String id, String name, User user) {
        assert id != null;
        assert name != null;
        assert user != null;
        this.id = id;
        this.name = name;
        this.collaborative = false;
        this.secret = false;
        this.user = user;
        this.songs = new HashSet<>();
    }

    public Playlist(String id, String name, User user, Set<Song> songs) {
        this(id,name,user);
        assert songs != null;
        this.songs.addAll(songs);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        assert name != null;
        this.name = name;
    }

    public boolean isCollaborative() {
        return collaborative;
    }

    public void setCollaborative(boolean collaborative) {
        this.collaborative = collaborative;
    }

    public boolean isSecret() {
        return secret;
    }

    public void setSecret(boolean secret) {
        this.secret = secret;
    }

    public User getUser() {
        return user;
    }

    public Set<Song> getSongs() {
        return songs;
    }

    public boolean contains(Song song) {
        return this.songs.contains(song);
    }

    public boolean add(Song song) {
        return this.songs.add(song);
    }

    public boolean addAll(Set<Song> songs){
        return this.songs.addAll(songs);
    }

    public boolean remove(Song song) {
        return this.songs.remove(song);
    }

    public boolean removeAll(Set<Song> songs){
        return this.songs.removeAll(songs);
    }

}

