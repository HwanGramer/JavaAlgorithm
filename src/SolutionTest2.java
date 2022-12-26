public class SolutionTest2 {

    public static void main(String[] args){
         System.out.println(solution(12));
    }

    public static int solution(int n) {
        int answer = 0;

        // 0%0 이렇게 발생시키면 안됨 .
        for( int i=1;  i <= n; i++ ){
            if(n%i == 0){
                answer += i;
            }
        }

        return answer;
    }

}
