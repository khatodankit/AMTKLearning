
public class SearchInArray {


    /**
     * An element in a sorted array can be found in O(log n) time via binary search.
     * But suppose we rotate an ascending order sorted array at some pivot unknown to you beforehand.
     * So for instance, 1 2 3 4 5 might become 3 4 5 1 2.
     * Devise a way to find an element in the rotated array in O(log n) time.
     * <p>
     * https://www.geeksforgeeks.org/search-an-element-in-a-sorted-and-pivoted-array/
     *
     * @param iArr   input array
     * @param search search integer
     * @return -1 if not found, else returns the index for element
     */
    public int searchInRotatedArray(int[] iArr, int search) {
        return searchInRotatedArray(iArr, search, 0, iArr.length - 1);

    }

    private int searchInRotatedArray(int[] iArr, int search, int startIndex, int endIndex) {
        System.out.println(startIndex + " " + endIndex);
        int size = endIndex - startIndex;

        if (iArr[startIndex] == search)
            return startIndex;
        if (iArr[endIndex] == search)
            return endIndex;
        else if (size == 1) return -1;

        int halfPoint = size / 2;

        if (iArr[halfPoint] == search)
            return halfPoint;


        if (search <= iArr[halfPoint] && search > iArr[startIndex])
            return searchInRotatedArray(iArr, search, startIndex, startIndex + halfPoint);
        else if (search < iArr[halfPoint] && search < iArr[startIndex])
            return searchInRotatedArray(iArr, search, startIndex + halfPoint, endIndex);
        else if (search >= iArr[halfPoint] && search < iArr[endIndex])
            return searchInRotatedArray(iArr, search, startIndex + halfPoint, endIndex);
        else if (search > iArr[halfPoint] && search > iArr[endIndex])
            return searchInRotatedArray(iArr, search, startIndex, startIndex + halfPoint);

        return -1;
    }

    public int binarySearch(int[] iArr, int search) {
        return binarySearch(iArr, search, 0, iArr.length - 1);
    }

    private int binarySearch(int[] iArr, int search, int startIndex, int endIndex) {
        int size = endIndex - startIndex;

        if (iArr[startIndex] == search)
            return startIndex;
        else if (size == 1) return -1;

        int halfPoint = size / 2;

        if (search < iArr[halfPoint]) return binarySearch(iArr, search, startIndex, startIndex + halfPoint);
        else return binarySearch(iArr, search, startIndex + halfPoint, endIndex);
    }
}