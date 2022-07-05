package behavioral.observer;

import java.util.LinkedHashSet;
import java.util.Set;

public class YoutubeSubject {

    final Set<Observer> observerSet = new LinkedHashSet<>();


    public void addSubscriber(final Observer observer) {
        this.observerSet.add(observer);
    }

    public void listSubscribers() {
        this.observerSet.forEach(System.out::println);
    }

}
