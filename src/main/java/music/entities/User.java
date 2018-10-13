package music.entities;

public class User {

    private String id;

    private String email;

    public User(String id, String email) {
        assert id != null;
        assert email != null;
        this.id = id;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        assert email != null;
        this.email = email;
    }
}
