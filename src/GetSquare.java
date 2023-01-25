public class GetSquare {
    public static void main(String[] args){
        System.out.print(solution(1));
    }

    public static long solution(long n) {
        long answer = -1;

        for(long i=1; i*i<= n; i++){
            if(i==n){
                answer=(i+1)*(i+1);
                break;
            }
        }

        return answer;
    }
}