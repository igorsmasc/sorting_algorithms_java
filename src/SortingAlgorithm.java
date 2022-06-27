public abstract class SortingAlgorithm {
    public abstract void sort(int[] array);

    protected void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
