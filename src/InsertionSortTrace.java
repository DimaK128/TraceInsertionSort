import java.util.Arrays;

public class InsertionSortTrace {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_BOLD = "\u001B[1m";

    public static void main(String[] args) {
        int[] array = {13, 75, 12, 4, 18, 6, 9, 10, 7, 14, 15};
        System.out.println("Initial Array: " + Arrays.toString(array));
        insertionSort(array);
        System.out.println("Sorted Array: " + Arrays.toString(array));
    }

    public static void insertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
            printArrayWithHighlight(array, i, j+1);
        }
    }

    public static void printArrayWithHighlight(int[] array, int iteration, int affectedIndex) {
        System.out.print("After iteration " + iteration + ": ");
        for (int i = 0; i < array.length; i++) {
            if (i == affectedIndex) {
                System.out.print(ANSI_BOLD + ANSI_RED + array[i] + ANSI_RESET + " ");
            } else {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }
}
