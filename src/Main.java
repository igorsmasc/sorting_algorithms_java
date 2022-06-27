import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // -------------------- //
        //    Selection Sort    //
        // -------------------- //

        int[] selectionArray = new int[]{10, 1, 5, 2, 4, 7, 8, 3, 6, 9};
        SortingAlgorithm selectionSort = new SelectionSort();
        System.out.println("Selection Sort Array - Before: " + Arrays.toString(selectionArray));
        selectionSort.sort(selectionArray);
        System.out.println("Selection Sort Array - After : " + Arrays.toString(selectionArray));
        System.out.println();


        // -------------------- //
        //     Bubble Sort      //
        // -------------------- //

        int[] bubbleArray = new int[]{10, 1, 5, 2, 4, 7, 8, 3, 6, 9};
        SortingAlgorithm bubbleSort = new BubbleSort();
        System.out.println("Bubble Sort Array - Before: " + Arrays.toString(bubbleArray));
        bubbleSort.sort(bubbleArray);
        System.out.println("Bubble Sort Array - After : " + Arrays.toString(bubbleArray));
        System.out.println();
    }
}
