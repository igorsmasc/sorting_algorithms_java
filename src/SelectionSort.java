public class SelectionSort extends SortingAlgorithm {
    @Override
    public void sort(int[] array) {
        for(int i = 0; i < array.length;i++) {
            int smallest = findSmallestValueIndex(array, i);
            swap(array, i, smallest);
        }
    }

    private static int findSmallestValueIndex(int[] array, int startAt) {
        int smallestValueIndex = startAt;
        for(int i = startAt+1; i < array.length; i++) {
            if(array[i] < array[smallestValueIndex]) {
                smallestValueIndex = i;
            }
        }
        return smallestValueIndex;
    }
}
