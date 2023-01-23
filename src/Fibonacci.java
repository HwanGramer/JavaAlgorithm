public class Fibonacci {
    public static void main(String[] args){
        System.out.println(solution(5));
    }

    public static int solution(int n){
        int[] arr = new int[n+2];
        for(int i=0; i < arr.length; i++){
            if(i==0) {arr[i] = 0; continue;}
            if(i==1) {arr[i] = 1; continue;}
            arr[i] = (arr[i-1] + arr[i-2])%1234567;
        }
        return arr[n];
    }

}
