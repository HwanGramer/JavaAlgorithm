public class StringInPandY {

    public static void main(String[] args){
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println(solution2("pPoooYyy"));
    }
    
    public static boolean solution2(String s) { //? 이게 훨 씬 빠름 
        s = s.toLowerCase();
        int p=0;
        int y=0;
        for(int i=0; i < s.length(); i++){
            if('p' == s.charAt(i)) p++;
            if('y' == s.charAt(i)) y++;
        }
        return p==y;
    }

    //? 문자열을 잘라서 쓰는것보다 charAt으로 하나씩 부르는게 훨 씬 빠름 
    
    public static boolean solution(String s) {
        int p = 0;
        int y = 0;

        String[] str = s.toLowerCase().split("");

        for(int i=0; i <str.length; i++){
            if(str[i].equals("p")) p++;
            if(str[i].equals("y")) y++;
        }

        return p==y;
    }

}
