import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args){
        int[] numbers = {5,4,3,1,3,6,7,8};
        sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    public static void sort(int[] numbers){
        for(int i=1; i < numbers.length; i++){
            for(int j=i; j >= 1; j--){
                if(numbers[j] < numbers[j-1]){
                    int temp = numbers[j];
                    numbers[j] = numbers[j-1];
                    numbers[j-1] = temp;
                }
            }
        }
    }

}
