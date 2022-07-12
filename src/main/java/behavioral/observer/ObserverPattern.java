package behavioral.observer;

public class ObserverPattern {
    public static void main(String[] args) {
        final YoutubeChannelFactory.Channel intellijNewsChannel = YoutubeChannelFactory.createChannel("IntellijNews", """
                This channel provides latest updates on the 
                intellij products!""");

        intellijNewsChannel.addSubscriber(new Subscriber1("john"));
        intellijNewsChannel.addSubscriber(new Subscriber2("johny"));

        intellijNewsChannel.uploadContent(new Content("IntellijIDEA news", """
                The newer versions has performance updates!"""));

        YoutubeChannelFactory.Channel stsChannel = YoutubeChannelFactory.createChannel("STS", "open source IDE channel");

        stsChannel.addSubscriber(new Subscriber3("pivotal"));

        stsChannel.uploadContent(new Content("STS cloud upload", """
                this channel produces content on pivotal sts cloud platform"""));


    }
}
