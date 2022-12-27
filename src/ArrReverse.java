
public class ArrReverse {
    public static void main(String[] args){
        solution(12345);
    }

    public static int[] solution(long n) {
        int[] answer = new int[String.valueOf(n).length()];

        String[] number = String.valueOf(n).split("");

        for(int i=0; i < number.length; i++){
            answer[i] = Integer.parseInt(number[number.length - i - 1]);
        }

        return answer;
    }
    // 문자열 이어붙힐때 StringBuilder를 사용하면 정말 좋다.
}
