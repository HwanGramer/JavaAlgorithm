public class Weridstr {

    public static void main(String[] args){
       System.out.print(solution("try hello world    ")); 
    }
    
    public static String solution(String s) {
        String[] strarr = s.split(" " ,-1); //? -1을 넣으면 맨위 문자열에서 공백도 문자열 취급이됨. 
        for(int i=0; i < strarr.length; i++){
            String a="";
            for(int j=0; j < strarr[i].length(); j++){
                if(j%2==0)a = a + String.valueOf(strarr[i].charAt(j)).toUpperCase();
                else a = a + String.valueOf(strarr[i].charAt(j)).toLowerCase();
            }
            strarr[i] = a;
        }

        return String.join(" ",strarr);
    }

}