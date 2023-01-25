import java.util.Arrays;

public class Reverse {

    public static void main(String[] args){
        System.out.print(Arrays.toString(solution(10000000000L)));
    }

    public static long[] solution(long n) {
        long[] answer = new long[Long.toString(n).length()];

        for(int i=0; i < answer.length; i++){
            answer[i] =  n%10;
            n=n/10;
        }

        return answer;
    }
}
