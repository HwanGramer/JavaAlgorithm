public class SolutionTest3 {
    public static void main(String[] agrs){
        System.out.println(solution(10));
    }

    public static String solution(int num) {
        return num % 2 == 0 ? "Even" : "Odd";
    }
}
