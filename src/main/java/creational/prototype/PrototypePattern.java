package creational.prototype;

import java.util.LinkedList;

public class PrototypePattern {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        // first in first out FIFO
        linkedList.push(10);
        linkedList.push(11);
        linkedList.push(13);

        linkedList.forEach(System.out::println);
    }
}
