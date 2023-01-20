import java.util.Arrays;

public class QuickSort {

    public static void main(String args[]){
        int[] numbers = {2,1,2,7,10,3,5};
        sort(numbers , 0 ,numbers.length-1);
        System.out.println(Arrays.toString(numbers));
    }

    public static void sort(int[] numbers , int start , int end){
        if(start >= end) return;

        int pivot = start;
        int i = start+1;
        int j = end;

        while(i <= j){
            while(numbers[pivot] >= numbers[i]){
                i++;
            }
            while(numbers[pivot] <= numbers[j] && j > start){
                j--;
            }
            if( i > j ) {//엇갈렸다면
                int temp = numbers[pivot];
                numbers[pivot] = numbers[j];
                numbers[j] = temp;
            }else{
                int temp = numbers[i];
                numbers[i] = numbers[j];
                numbers[j] = temp;
            }
        }

        sort(numbers , start , j-1);
        sort(numbers , j+1 , end );

    }
}
