package music.models;

import java.util.ArrayList;
import java.util.List;

public class Folder extends File{

    private List<File> files;

    public Folder(String name) {
        super(name);
        files = new ArrayList<>();
    }

    @Override
    public void add(File file) {
        assert files != null;
        this.files.add(file);
    }

    @Override
    public void remove(File file) {
        assert files != null;
        this.files.remove(file);
    }

    @Override
    public boolean isFolder() {
        return true;
    }

    @Override
    public String view() {
        return this.getName();
    }

    @Override
    public List<File> listFiles() {
        return this.files;
    }
}
