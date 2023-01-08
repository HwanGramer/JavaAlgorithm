import java.util.ArrayList;
import java.util.Arrays;

public class DivisibleArrNum {
    public static void main(String[] args){
        System.out.println(Arrays.toString(solution2(new int[]{3,5,120,53,10}, 5)));
    }

    public static int[] solution2(int[] arr , int divisor){ // 이건 좀 느리넹

        int[] answer = Arrays.stream(arr).filter(factor -> factor%divisor==0).toArray();

        Arrays.sort(answer);

        return answer.length==0 ? new int[] {-1} : answer;

    }

    public static int[] solution(int[] arr , int divisor){
        ArrayList<Integer> arrlist = new ArrayList<Integer>();

        for(int i=0; i<arr.length; i++){
            if(arr[i]%divisor==0){
                arrlist.add(arr[i]);
            }
        }

        if(arrlist.size()==0){
            arrlist.add(-1);
        }

        int[] intarr = new int[arrlist.size()];

        for(int i=0; i<intarr.length; i++){
            intarr[i] = arrlist.get(i);
        }

        Arrays.sort(intarr);

        return intarr;

    }

}
