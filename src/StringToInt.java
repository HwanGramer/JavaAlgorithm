public class StringToInt {
    public static void main(String[] args){
        System.out.println(solution("-1d234"));
    }

    public static int solution(String str){
        try{
            int answer = Integer.parseInt(str);
            return answer;
        }catch(NumberFormatException ex){
            System.out.println("올바른 숫자를 입력해주세요");
            return 0;
        }
    }
}
