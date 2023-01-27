import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MinNumDel {

    public static void main(String[] args){
        System.out.print(Arrays.toString(solution(new int[] {4,3,2,1}))); 
    }

    public static int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        int j = arr[0];
        for(int i=0 ; i <arr.length ; i++){
            if(arr[i] < j){
                j = arr[i];
            }
        }

        for(int i=0 ; i < arr.length; i++){
            if(arr[i] > j) list.add(arr[i]);
        }

        if(list.size()==0) return new int[] {-1};

        int[] answer = new int[list.size()];
        for(int i=0; i < list.size(); i++){
            answer[i] = list.get(i);
        }

        return answer;
    }
    
}
