import org.junit.Assert;
import org.junit.Test;

public class SearchInArrayTest {

    @Test
    public void searchInRotatedArray() {
        Assert.assertEquals(3, new SearchInArray().searchInRotatedArray(new int[]{3, 4, 5, 1, 2}, 1));
        Assert.assertEquals(8, new SearchInArray().searchInRotatedArray(new int[]{5, 6, 7, 8, 9, 10, 1, 2, 3}, 3));
        Assert.assertEquals(-1, new SearchInArray().searchInRotatedArray(new int[]{5, 6, 7, 8, 9, 10, 1, 2, 3}, 30));
        Assert.assertEquals(3, new SearchInArray().searchInRotatedArray(new int[]{30, 40, 50, 10, 20}, 10));
        Assert.assertEquals(4, new SearchInArray().searchInRotatedArray(new int[]{30, 30, 40, 50, 10, 20}, 10));
        Assert.assertEquals(0, new SearchInArray().searchInRotatedArray(new int[]{30, 30, 40, 50, 10, 30}, 30));
        Assert.assertEquals(2, new SearchInArray().searchInRotatedArray(new int[]{30, 40, 40, 50, 10, 30}, 40));

    }

    @Test
    public void binarySearch() {
        Assert.assertEquals(0, new SearchInArray().binarySearch(new int[]{1, 2, 3, 4, 5}, 1));
        Assert.assertEquals(2, new SearchInArray().binarySearch(new int[]{1, 2, 3, 5, 6, 7, 8, 9, 10}, 3));
        Assert.assertEquals(-1, new SearchInArray().binarySearch(new int[]{1, 2, 3, 5, 6, 7, 8, 9, 10}, 30));
    }
}