package music.models;

import org.apache.logging.log4j.LogManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.function.Consumer;

import static org.junit.jupiter.api.Assertions.*;

class PodcastFactoryTest {

    PodcastFactory podcastFactory;

    Podcast podcast;

    Podcast podcast2;

    Podcast podcast3;

    @BeforeEach
    void before() {
        podcastFactory = PodcastFactory.getFactory();
        podcast = new Podcast("1", "podcastName", "podcastDescription");
        podcast2 = new Podcast("2", "podcast2Name", "podcast2Description");
        podcast3 = new Podcast("3", "podcast3Name", "podcast3Description");
        podcastFactory.addPodcast(podcast);
    }

    @Test
    void testGetPodcast() {
        assertEquals(podcast, podcastFactory.getPodcast("1"));
    }

    @Test
    void testRemovePodcast() {
        podcastFactory.removePodcast(podcast.getId());
        assertNull(podcastFactory.getPodcast("1"));
    }

    @Test
    void testSubscriptionLog(){
        Consumer<String> subscription = podcastFactory.subscribe(
                s -> LogManager.getLogger(this.getClass()).info("Añadido nuevo podcast: " + s)
        );
        podcastFactory.addPodcast(podcast2);
        podcastFactory.unsubscribe(subscription);
        podcastFactory.addPodcast(podcast3);
    }

    @Test
    void testSubscriptionAssert() {
        podcastFactory.subscribe((String s) -> assertEquals("test", s));
        podcastFactory.addPodcast(new Podcast("3", "test", "podcast3Description"));
    }

}