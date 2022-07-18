package behavioral.iterator;

import java.util.Iterator;
import java.util.List;

public class PersonIterator<Person> implements Iterator<Person> {

    private final List<Person> personList;
    private int elementsIterated;
    private int elementsAccessed;

    public PersonIterator(List<Person> personList) {
        this.personList = personList;
    }

    @Override
    public boolean hasNext() {
        if (personList.isEmpty() || this.elementsIterated == personList.size()) {
            return false;
        }

        if (this.elementsIterated < personList.size()) {
            this.elementsIterated++;
            return true;
        }


        return false;
    }

    @Override
    public Person next() {

        if (personList.isEmpty() || this.elementsAccessed >= personList.size()) {
            return null;
        }

        Person person = this.personList.get(this.elementsAccessed);
        this.elementsAccessed++;

        return person;
    }
}
