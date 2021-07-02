package recursivebinarysearch;


/**
 *
 * @author Keeran Moodley
 */
public class RecursiveBinarySearch {
    //user facing code
    public static int recursiveBinarySearch(int[] arr, int val) {
        return recursiveBinarySearch(arr, val, 0, arr.length - 1);
    }
    //class code
    private static int recursiveBinarySearch(int[] arr, int val, int beg, int end) {
        int hi = end;
        int lo = beg;
        int mid = (hi + lo) / 2;

        //trivial case
        if (arr[mid] == val) {
            return mid;
        }
        //nontrivial recursive cases
        if (val > arr[mid]) {
            return recursiveBinarySearch(arr, val, mid + 1, end);
        }
        if (val < arr[mid]) {
            return recursiveBinarySearch(arr, val, beg, mid - 1);
        }
        return -1;
    }

    public static void main(String[] args) {
        // CODE HERE
        int[] values = {10, 20, 25, 35, 50, 70, 85, 100, 110, 120};

        for (int i : values) {
            System.out.println(recursiveBinarySearch(values, i));
        }
    }
}

