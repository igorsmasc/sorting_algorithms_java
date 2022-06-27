import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] selectionArray = new int[]{10, 1, 5, 2, 4, 7, 8, 3, 6, 9};
        System.out.println("Selection Sort Array - Before: " + Arrays.toString(selectionArray));
        SelectionSort.sort(selectionArray);
        System.out.println("Selection Sort Array - After : " + Arrays.toString(selectionArray));
    }
}
