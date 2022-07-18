package behavioral.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PersonList implements Iterable<Person> {
    private final List<Person> list;

    public PersonList() {
        this.list = new ArrayList<>();
    }

    public boolean add(Person person) {
        return this.list.add(person);
    }

    public boolean remove(Person person) {
        return this.list.remove(person);
    }

    @Override
    public Iterator<Person> iterator() {
        return new PersonIterator<>(this.list);
    }
}
