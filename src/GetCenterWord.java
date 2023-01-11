public class GetCenterWord {
    public static void main(String[] args){
        System.out.println(solution("abcde"));
    }

    public static String solution(String s){
        System.out.println(s.length()/2);
        return s.length()%2==1 ? s.charAt((s.length()/2))+"" : s.charAt(s.length() / 2 - 1) + String.valueOf(s.charAt(s.length()/2));
    }
}
