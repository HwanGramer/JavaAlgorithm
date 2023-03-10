public class Collatz {

    public static void main(String[] args){
        System.out.print(solution(626331));
    }

    
    public static int solution(long num) {
        int answer = 0;

        if(num==1) return 2;
        while(true){
            if(answer>=500){
                answer = -1;
                break;
            }
            if(num%2==0)
                num = num/2;
            else
                num = num*3 + 1;
            
            if(num==1) break;
            answer++;
            
        }

        return answer;
    }
}
