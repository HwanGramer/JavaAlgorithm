public class Factorial {

    public static void main(String[] args){
        System.out.println(solution(3628800));
    }
    public static int solution(int n){
        int answer = 1;
        for(int i=1; i <= n; i++){
            int number = 1;
            for(int j=1; j <= i; j++){
                number=number*j;
            }
            if(number > n){
                answer=i-1;
                break;
            }
        }
        return answer;
    }
}
