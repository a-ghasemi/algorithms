package search;

import java.util.List;

public class BinarySearch<T extends Comparable<T>> implements Search<T> {
    List<T> collection;

    public BinarySearch(List<T> collection) {
        this.collection = collection;
    }

    @Override
    public Integer indexOf(T element) {
        int low = 0;
        int high = collection.size() - 1;

        while (low <= high) {
            int mid = (high + low) / 2;
            int comparison = collection.get(mid).compareTo(element);

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
