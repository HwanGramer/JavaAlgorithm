public class RemainderOne {
    public static void main(String[] args){
        System.out.print(solution(10));
    }

    public static int solution(int n) {
        int answer = 0;
        for(int i=1; i < n; i++){
            if(n%i==1){
                answer = i;
                break;
            }
        }
        return answer;
    }
    
}
