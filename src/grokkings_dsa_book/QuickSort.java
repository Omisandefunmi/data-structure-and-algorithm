package grokkings_dsa_book;

public class QuickSort {
    public static void main(String[] args) {
        int [] sample = {1, 4, 2, 8, 5, 3, 9};
        quickSort(sample, 0, sample.length);

        for (int j : sample) {
            System.out.println(j);
        }
    }
    public static void quickSort(int [] array, int start, int end ){
        if(end - start < 2){ return;}
        int pivotIndex = partition(array, start, end);
        quickSort(array, start, pivotIndex);
        quickSort(array, pivotIndex + 1, end);
    }

    private static int partition(int[] array, int start, int end) {
        int pivot = array[start];
        int i = start;
        int j =end;

        while(i < j){
            while(i < j && array[--j] >= pivot) {
                if (i < j) {
                    array[i] = array[j];
                }
            }
            while (i < j && array[++i] < pivot){
                if(i < j){
                    array[j] = array[i];
                }
            }
        }
        array[j] = pivot;
        return j;
    }
}
