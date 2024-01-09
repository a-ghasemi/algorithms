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
}
