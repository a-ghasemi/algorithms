package search;

import java.util.Collection;

public class BinarySearch<T> implements Search<T> {
    T[] collection;

    public BinarySearch(T[] collection){
        this.collection = collection;
    }

    @Override
    public Integer indexOf(T element) {
        return null;
    }
}
