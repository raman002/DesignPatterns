package behavioral.iterator;

import java.util.Iterator;

public class IteratorPattern {
    public static void main(String[] args) {
        PersonList personList = new PersonList();

        personList.add(new Person("brahma"));
        personList.add(new Person("vishnu"));
        personList.add(new Person("mahesh"));

        Iterator<Person> personIterator = personList.iterator();

        if (personIterator.hasNext()) {
            System.out.println(personIterator.next());
        }

        System.out.println(personIterator.next());
        System.out.println(personIterator.next());
        System.out.println(personIterator.next());

    }
}
