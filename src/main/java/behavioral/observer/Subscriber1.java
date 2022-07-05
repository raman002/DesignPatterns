package behavioral.observer;

public class Subscriber1 implements Observer {

    private String name;

    @Override
    public void newContentAvailable(Content content) {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Subscriber1 that = (Subscriber1) o;

        return name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
