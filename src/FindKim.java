import java.util.Arrays;

public class FindKim {
    public static void main(String[] args){
        System.out.println(solution2(new String[] {"june" , "Kim"}));
    }

    public static String solution(String[] seoul){
        for(int i=0; i<seoul.length; i++){
            if(seoul[i].equals("Kim")){
                return "김서방은 " + i + "에 있다";
            }
        }
        return "";
    }

    public static String solution2(String[] seoul){
        return "김서방은 "+Arrays.asList(seoul).indexOf("Kim") + "에 있다";
    }
}
