public class GetCenterChar {

    public String solution(String s) {
        String answer = "";

        if(s.length()%2==0)
            answer = String.valueOf(s.charAt((s.length()/2)-1));

        answer += String.valueOf(s.charAt(s.length()/2));
        
        return answer;
    }
}