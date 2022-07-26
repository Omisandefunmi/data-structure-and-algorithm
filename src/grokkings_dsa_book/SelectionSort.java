package grokkings_dsa_book;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] array = new int[]{1, 3, 5, 2, 8, 65, 1, 0};
        System.out.println(findSmallestItemIndex(array));
        System.out.println(Arrays.toString(selectionSort(array)));
    }
    public static int findSmallestItemIndex(int[] array){
        int smallestIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if(array[i] <= array[smallestIndex]){smallestIndex = i;}
        }
        return smallestIndex;
    }

    public static int[] selectionSort(int[] array){
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int smallest = findSmallestItemIndex(array);
            newArray[i] = array[smallest];
            array[smallest] = Integer.MAX_VALUE;

        }
       return newArray;
    }
}
