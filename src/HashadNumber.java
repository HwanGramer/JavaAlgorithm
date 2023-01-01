import java.util.ArrayList;

public class HashadNumber {
    public static void main(String[] args){
        System.out.println(solution(15));
    }

    public static boolean solution(int x){
        int answer = 0;

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        String str = String.valueOf(x);

        for(int i=0; i < str.length(); i++){
            numbers.add(Integer.parseInt(String.valueOf(str.charAt(i))));
        }

        for(int i=0; i< numbers.size(); i++){
            answer += numbers.get(i);
        }

        return x%answer==0 ? true : false;
    }
}
