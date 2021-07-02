package selectionsort;

/**
 *
 * @author Keeran Moodley
 */
public class SelectionSort {

    public static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            if (min != i) {
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
        return arr;
    }

    public static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static int[] insertionSort(int[] arr) {
        int value;
        int position;

        for (int i = 1; i < arr.length; i++) {
            value = arr[i];
            position = i;

            while (position > 0 && arr[position - 1] > value) {
                arr[position] = arr[position - 1];
                position--;
            }
            arr[position] = value;
        }
        return arr;
    }
    
    

    public static void main(String[] args) {
        // CODE HERE
        int[] values = {4, 3, 2, 1, 5, 64, 6432, 0};
        int[] sorted = insertionSort(values);

        for (int i = 0; i < sorted.length; i++) {
            System.out.println(sorted[i]);
        }
    }

}
