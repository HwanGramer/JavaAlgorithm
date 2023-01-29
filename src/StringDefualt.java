public class StringDefualt {

    public static void main(String[] args){
        System.out.print(solution("1234")); 
    }

    public static boolean solution(String s) {
        if(s.length()==4 || s.length()==6){
            try{
                int i = Integer.parseInt(s);
                return true;
            }catch(NumberFormatException ex){
                return false;
            }
        }
        return false;
    }
    
}
