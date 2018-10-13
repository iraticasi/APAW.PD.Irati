package music.entities;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class SongBuilderTest {

    @Test
    void TestFull(){
        LocalDateTime date = LocalDateTime.now();
        Song song = new SongBuilder("1", "my song").singer("my singer")
                .seconds(200).date(date).genre(Genre.CLASSIC).build();
        assertEquals("1", song.getId());
        assertEquals("my song", song.getName());
        assertEquals("my singer", song.getSinger());
        assertEquals(200, song.getSeconds());
        assertEquals(date, song.getDate());
        assertEquals(Genre.CLASSIC, song.getGenre());
    }
}