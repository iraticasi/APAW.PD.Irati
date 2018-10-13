package music.entities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FileTest {

    private File root;

    private File folderFile;

    private File songFile;


    @BeforeEach
    void before(){
        root = new Folder("root");
        folderFile = new Folder("folderFile");
        songFile = new SongFile(new Song("1", "mi cancion"));
        root.add(songFile);
        root.add(folderFile);

    }

    @Test
    void testView(){
        assertEquals("root",root.view());
        assertEquals("1", songFile.view());
    }

    @Test
    void testIsFolder(){
        assertTrue(root.isFolder());
        assertFalse(songFile.isFolder());
    }

    @Test
    void testAddInSongFile(){
        assertThrows(UnsupportedOperationException.class, () -> songFile.add(root));
    }

    @Test
    void testRemoveInSongFile(){
        assertThrows(UnsupportedOperationException.class, () -> songFile.remove(root));
    }

    @Test
    void testListFiles(){
        List<File> expected = new ArrayList<>();
        expected.add(songFile);
        expected.add(folderFile);
        assertEquals(expected, root.listFiles());
        assertEquals(null, songFile.listFiles());
        assertTrue(folderFile.listFiles().isEmpty());
    }

}