import java.util.Arrays;
import java.util.Comparator;

public class StringReverse {

    public String solution(String s) {

        String[] arr = s.split("");

        Arrays.sort(arr , Comparator.reverseOrder());

        StringBuilder sb = new StringBuilder();
        for(int i=0; i < s.length(); i++){
            sb.append(arr[i]);
        }

        return sb.toString();

    }
    
}
