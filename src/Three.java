
public class Three {
    public static void main(String[] args){
        solution(45);
    }

    public static int solution(int n) {
        int answer = n;

        for(int i=1; i <= n; i=i*3){
            System.out.println(i);
        }

        return answer;
    }
}
