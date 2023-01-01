import java.util.Arrays;
import java.util.Collections;

public class ReverseSort {
    public static void main(String[] args){
        System.out.println(solution2(50341L));
    }

    // 이거 진짜 깔끔하네.
    public static long solution2(long n) {
        String[] list = String.valueOf(n).split("");
        Arrays.sort(list , Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();
        for (String aList : list) sb.append(aList);

        return Long.parseLong(sb.toString());
    }

    // 내가 작성한답인데 별로 좋지않음. 깨달은건 문자열도 정렬이 된다는거
    public static long solution(long x){
        String[] xx = String.valueOf(x).split("");

        Integer[] longarr = new Integer[xx.length];
        StringBuilder stringBuilder = new StringBuilder();

        for(int i=0; i < xx.length; i++){
            longarr[i] = Integer.parseInt(xx[i]);
        }

        Arrays.sort(longarr , Collections.reverseOrder());

        for(int i=0; i < longarr.length; i++){
            stringBuilder.append(longarr[i]);
        }

        return Long.parseLong(stringBuilder.toString());
    }


}
