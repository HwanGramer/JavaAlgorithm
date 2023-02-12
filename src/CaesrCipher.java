public class CaesrCipher {

    public static void main(String[] args) {
        System.out.print(solution("yz", 1)); 
    }
    
    public static String solution(String s , int n){
        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder("");

        for(int i=0; i < chars.length; i++){
            if((chars[i] <= 90 && chars[i] + n > 90) || (chars[i] <= 122 && chars[i] + n > 122 ) )
                chars[i] = (char) (chars[i] - 26);
            if(chars[i] != ' ')chars[i] = (char) (chars[i] + n);
            sb.append(chars[i]);
        }
        
        return sb.toString();
    }

}
