package search;

import org.junit.Test;
import org.junit.Assert;

public class TestBinarySearch {

    @Test
    public void testFindElementIndex() {
        int[] initialCollection = new int[]{1, 2, 3, 4, 5};
        int searchFor = 3;
        int expectedResult = 2;

        Search<Integer> binarySearchEngine = new BinarySearch<>(initialCollection);
        Integer index = binarySearchEngine.indexOf(searchFor);

        Assert.assertSame("message", expectedResult, index);
    }

    @Test
    public void testElementNotFound() {
        int[] initialCollection = new int[]{1, 2, 3, 4, 5};
        int searchFor = 6;

        Search<Integer> binarySearchEngine = new BinarySearch<>(initialCollection);
        Integer index = binarySearchEngine.indexOf(searchFor);

        Assert.assertNull(String.format("There is no %s in this array", searchFor), index);
    }
}
