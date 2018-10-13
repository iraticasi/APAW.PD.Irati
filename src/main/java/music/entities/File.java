package music.entities;

import java.util.List;

public abstract class File {

    private String name;

    public File(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public abstract void add(File file);

    public abstract void remove(File file);

    public abstract boolean isFolder();

    public abstract String view();

    public abstract List<File> listFiles();
}
