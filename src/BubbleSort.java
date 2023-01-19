import java.util.Arrays;

public class BubbleSort{
    public static void sort(int[] numbers){
        for(int i=0; i < numbers.length; i++){
            for(int j=0; j<numbers.length-1-i; j++){
                if(numbers[j] > numbers[j+1]){
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args){
        int[] numbers = {5,4,3,1,3,6,7,8};
        sort(numbers);
        printArr(numbers);
    }

    public static void printArr(int[] numbers){
            System.out.println( Arrays.toString(numbers));
    }

}