package behavioral.observer;

public class ObserverPattern {
    public static void main(String[] args) {
        final YoutubeChannelFactory.Channel intellijNewsChannel = YoutubeChannelFactory.createChannel("IntellijNews", """
                This channel provides latest updates on the 
                intellij products!""");

        intellijNewsChannel.uploadContent(new Content("IntellijIDEA news", """
                The newer versions has performance updates!"""));

        intellijNewsChannel.uploadContent(new Content("IntellijIDEA setting up in windows", """
                The new version of intellij idea is available!"""));

        intellijNewsChannel.getContent().forEach(content -> {
            System.out.println("content.hashCode() = " + content.hashCode());
        });
    }
}
