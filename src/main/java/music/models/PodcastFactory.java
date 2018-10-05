package music.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class PodcastFactory {

    private static final PodcastFactory factory = new PodcastFactory();

    private Map<String, Podcast> podcasts;

    private List<Consumer<String>> consumers;

    private PodcastFactory() {
        this.podcasts = new HashMap<>();
        this.consumers = new ArrayList<>();
    }

    public static PodcastFactory getFactory() {
        return factory;
    }

    public Podcast getPodcast(String id) {
        return this.podcasts.get(id);
    }

    public void addPodcast(Podcast podcast){
        this.podcasts.put(podcast.getId(), podcast);
        this.consumers.forEach(c -> c.accept(podcast.getName()));
    }

    public void removePodcast(String id) {
        this.podcasts.remove(id);
    }

    public Consumer<String> subscribe(Consumer<String> consumer) {
        this.consumers.add(consumer);
        return consumer;
    }

    public void unsubscribe(Consumer<String> consumer) {
        this.consumers.remove(consumer);
    }

}
