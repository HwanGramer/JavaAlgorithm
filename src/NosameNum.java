import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class NosameNum {

    public static void main(String[] args){
        solution(new int[] {1,1,3,3,0,1,1});
    }
    
    public static int[] solution(int []arr) {

        List<Integer> l = new ArrayList<>();

        l.add(arr[0]);
        for(int i=1; i < arr.length; i++){
            if(l.get(l.size()-1) == arr[i]) continue;
            l.add(arr[i]);
        }

        int[] answer = new int[l.size()];
        for(int i=0; i < answer.length;i++){
            answer[i] = l.get(i);
        }

        return answer;
        
    }
}
