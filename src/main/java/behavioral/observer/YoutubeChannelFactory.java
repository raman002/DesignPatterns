package behavioral.observer;

import java.util.*;

public final class YoutubeChannelFactory {
    private static final Map<String, Channel> CHANNEL_MAP = new HashMap<>();

    public static Channel createChannel(String name, String description) {
        final Channel channel = new Channel(name, description);
        System.out.println("channel = " + channel.hashCode());
        CHANNEL_MAP.putIfAbsent(name, channel);
        return channel;
    }

    public static class Channel {

        private final String name;
        private final String description;
        private final Set<Content> contentList = new HashSet<>();

        private Channel(String name, String description) {
            this.name = name;
            this.description = description;
        }

        public String getName() {
            return this.name;
        }

        public String getDescription() {
            return this.description;
        }

        public boolean uploadContent(final Content content) {
           return this.contentList.add(content);
        }

        public Set<Content> getContent() {
            return Collections.unmodifiableSet(this.contentList);
        }
    }
}
