public class Harshad {


    public static void main(String[] args){
        System.out.print(solution(1));
    }

    public static boolean solution(int x) {
        int hap=0;
        String[] arr = String.valueOf(x).split("");
        for(int i=0; i < arr.length; i++){
            hap+= Integer.parseInt(arr[i]);
        }
        return x%hap==0 ? true : false;
    }
    
}
