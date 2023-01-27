
public class HidePhone {

    public static void main(String[] args){
        System.out.print(solution("01033334444")); 
    }
    

    //? 너무 느림. String+="e" -> 사용 X
    public static String solution(String phone_number) {
        String[] arr = phone_number.split("");

        StringBuilder sb = new StringBuilder();

        for(int i=0 ; i < arr.length-4; i++){
            sb.append("*");
        }
        for(int i=arr.length-4; i < arr.length; i++){
            sb.append(arr[i]);
        }
        return sb.toString();
    }
}
