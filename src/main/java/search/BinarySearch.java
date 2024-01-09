package search;

import static java.util.Arrays.sort;

public class BinarySearch<T extends Comparable<T>> implements Search<T> {
    T[] collection;

    public BinarySearch(T[] collection) {
        this.collection = collection;
    }

    @Override
    public Integer indexOf(T element) {
        int low = 0;
        int high = collection.length - 1;

        while (low <= high) {
            int mid = (high + low) / 2;
            int comparison = collection[mid].compareTo(element);

            if (comparison > 0) {
                high = mid - 1;
            } else if (comparison < 0) {
                low = mid + 1;
            } else {
                return mid;
            }
        }

        return null;
    }
}
