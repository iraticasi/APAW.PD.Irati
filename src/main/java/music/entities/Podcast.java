package music.entities;

public class Podcast {

    private String id;

    private String name;

    private String descpription;

    public Podcast(String id, String name, String description) {
        assert id != null;
        assert name != null;
        this.id = id;
        this.name = name;
        this.descpription = description;
    }

    public Podcast(String id, String name) {
        this(id, name, null);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescpription() {
        return descpription;
    }

    public void setDescpription(String descpription) {
        this.descpription = descpription;
    }

}
