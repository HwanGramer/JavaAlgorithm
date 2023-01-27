import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class DivisionArr {

    public static void main(String[] args){
        System.out.print(Arrays.toString(solution(new int[] {5,9,7,10} , 5)));
    }

    public static int[] solution(int[] arr, int divisor) {
    ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0; i < arr.length; i++){
            if(arr[i] % divisor == 0) list.add(arr[i]);
        }

        if(list.size()==0) return new int[] {-1};

        Collections.sort(list);
        int[] answer = new int[list.size()];
        for(int i=0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}
