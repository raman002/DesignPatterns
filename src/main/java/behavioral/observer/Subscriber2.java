package behavioral.observer;

public class Subscriber2 implements Subscriber {

    private String name;

    public Subscriber2(String name) {
        this.name = name;
    }

    @Override
    public void newContentAvailable(Content content) {
        System.out.println("Subscriber2: new content update: " + content);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Subscriber2 that = (Subscriber2) o;

        return name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
