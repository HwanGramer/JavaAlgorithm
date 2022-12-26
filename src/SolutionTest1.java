public class SolutionTest1 {
    public static void main(String[] args){
        Solution solution = new Solution();
        System.out.println(solution.solution(new int[] {5,5}));
    }


}

class Solution{
    public double solution(int[] arr){
        double answer = 0;
        for(int i=0; i < arr.length; i++){
            answer += arr[i];
        }

        return answer/arr.length;
    }
}