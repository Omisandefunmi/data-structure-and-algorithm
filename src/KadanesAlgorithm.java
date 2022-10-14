public class KadanesAlgorithm {
    public static int findFirstNonDuplicateNumber(int [] numbers){

        for (int i = 0; i < numbers.length; i++) {
            if(i == numbers.length - 1){
                if(numbers[i -1] != numbers[i]){
                    return numbers[i];
                }
            }
            else if(numbers[i] == numbers[i +1]){
            i++;
            }
            else{
                return numbers[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] nums = {1, 1, 3, 3, 4, 4, 4, 5};
        System.out.println(findFirstNonDuplicateNumber(nums));
    }
}
