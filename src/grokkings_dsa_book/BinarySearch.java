package grokkings_dsa_book;

public class BinarySearch {

    public static void main(String[] args) {
        int [] sample = new int[] {1, 3, 6, 9, 10, 58};
        System.out.println(binarySearch(sample, 52));
    }
    public static int binarySearch(int[] array, int item){
        int low = 0;
        int high = array.length - 1;

        while(low <= high){
            int mid = (low + high) / 2;
            int guess = array[mid];
            if(guess == item){ return mid; }
            if (guess > item){ high = mid - 1;}
            else{ low = mid + 1;}
        }
        return -1;
    }
}
