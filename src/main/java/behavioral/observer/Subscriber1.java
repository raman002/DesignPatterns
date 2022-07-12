package behavioral.observer;

public class Subscriber1 implements Subscriber {

    private String name;

    public Subscriber1(String name) {
        this.name = name;
    }

    @Override
    public void newContentAvailable(Content content) {
        System.out.println("Subscriber1: new content update: " + content);
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
