public class InsertionSort extends SortingAlgorithm {
    @Override
    public void sort(int[] array) {
        for(int i = 1; i < array.length; i++) {
            int currentNumber = array[i];

            int j = i - 1;

            while(j >= 0 && array[j] > currentNumber) {
                swap(array, j, j + 1);
                j--;
            }

            array[j+1] = currentNumber;
        }
    }
}
