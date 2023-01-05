public class CollatzGuess {
    public static void main(String[] args){
        System.out.println(solution(16));
    }

    public static int solution(long num){

        int count = 0;

        while(true){
            if(num == 1) return count;
            if(count==500) return -1;
            num = num%2==0 ? num/2 : num*3+1;
            count++;
        }
    }
}
