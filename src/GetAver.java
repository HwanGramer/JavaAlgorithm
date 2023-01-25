public class GetAver {

    public static void main(String[] args){
        solution(new int[] {1,2,3,4});
    }

    public static double solution(int[] arr){
        double answer = 0;
        for(int i=0; i < arr.length; i++){
            answer+=arr[i];
        }
        return answer/arr.length;
    }
    
}
