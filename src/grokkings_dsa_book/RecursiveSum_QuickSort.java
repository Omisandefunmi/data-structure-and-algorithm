package grokkings_dsa_book;

public class RecursiveSum_QuickSort {
    public static void main(String[] args) {
        int [] sample = new int []{2, 4, 6, 2};
        System.out.println(sumOfArray(sample, 0));
    }
    public static int sumOfArray(int[] array, int count) {
        int sum;
        if (count == array.length) {
            return 0;
        }
        sum = array[count] + sumOfArray(array, count+1);
        return sum;
    }


}
