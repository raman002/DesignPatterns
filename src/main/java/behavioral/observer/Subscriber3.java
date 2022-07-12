package behavioral.observer;

public class Subscriber3 implements Subscriber {

    private String name;

    public Subscriber3(String name) {
        this.name = name;
    }

    @Override
    public void newContentAvailable(Content content) {
        System.out.println("Subscriber3: new content update: " + content);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Subscriber3 that = (Subscriber3) o;

        return name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
