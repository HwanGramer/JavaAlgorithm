public class PlusMeasure {

    public static void main(String[] args){
        System.out.println(solution(24, 27));
    }

    public static int solution(int left, int right) {
        int answer = 0;

        for(int i = left; i <= right; i++){
            if(findMeasure(i)%2==0) answer+=i;
            else answer-=i;
        }

        return answer;
    }

    public static int findMeasure(int num){
        int number = 0;

        for(int i=1 ; i <= num; i++){
            if(num%i==0) number++;
        }

        return number;
    }

    
}
