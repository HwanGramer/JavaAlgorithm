
import java.util.Arrays;

public class HidePhoneNumber {
    public static void main(String[] args){
        System.out.println(solution3("01033334444"));
    }

    public static String solution3(String number){
        // substring은 해당문자열을 인자까지 자른다.
        String answer="";
        for(int i=0; i<number.length()-4; i++)
            answer+="*";
        answer += number.substring(number.length()-4);
        return answer;
    }

    public static String solution2(String number){
        char[] charr = number.toCharArray(); // 문자열을 문자배열로 만든다.
        for(int i=0; i < charr.length-4; i++){
            charr[i] = '*';
        }
        return String.valueOf(charr);
    }

    public static String solution(String number){
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<number.length()-4; i++){
            sb.append("*");
        }
        for(int i=number.length()-4; i < number.length(); i++){
            sb.append(number.charAt(i));
        }
        return sb.toString();
    }
}
