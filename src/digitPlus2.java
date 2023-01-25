public class digitPlus2 {

    public static void main(String[] args){

    }
    
    public static int solution2(int n) { //? 이게 훨씬 빠름.
        int answer = 0;

        while(true){
            answer += n%10;
            if(n/10==0) break;
            n=n/10;
        }

        return answer;
    }
    public static int solution(int n) {
        int answer = 0;
        
        String str[] = Integer.toString(n).split("");

        for(int i=0; i <str.length; i++){
            answer+= Integer.parseInt(str[i]);
        }

        return answer;
    }
}
