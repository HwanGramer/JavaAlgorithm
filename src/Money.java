import java.util.Arrays;

public class Money {
    public static void main(String[] args){
        System.out.println(solution(new int[] {1,2,2,3,4,5}, 10)); 
    }

    public static int solution(int[] d, int budget) {
        int answer = 0;
        int sum = 0;

        Arrays.sort(d);
        for(int i : d){
            sum+=i;
            if(sum <= budget){
                answer+=1;
            }else{
                break;
            }
        }
        return answer;
    }
}
