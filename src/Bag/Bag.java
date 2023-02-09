package Bag;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Bag<E> implements Iterable<E> {
    private List<E> elements;

    public Bag() {
        this.elements = new ArrayList<>();
    }

    public void add(E element) {
        elements.add(element);
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }

    public int size() {
        return elements.size();
    }

    @Override
    public Iterator<E> iterator() {
        return elements.iterator();
    }
}
