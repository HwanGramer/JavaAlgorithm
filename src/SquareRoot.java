

public class SquareRoot {
    // 풀면서 깨달은점 for문을 돌릴때 i의 타입은 n의 타입과 맞추자.
    // ex) long n 가 있다. n은 long형이다. 근데 반복문이 for(int i=0; i < n; i++) 반복자 i 가 int형이다.
    // 그렇다면 int형 i가 long형 n까지 돌 수 있을까? i는 오버플로우가 되면서 이상해 질 것이다. 그러므로 반복자i도 도착점과 똑같이 long형으로
    // 해주어야된다. for(long i=0; i < n; i++) 이게 맞는거다.
    public static void main(String[] args){
        String str = "asd2";
        int a = 344;

        System.out.println(str + a);

        System.out.println(solution(3));
        System.out.println(solution2(121));
    }

    public static long solution(long n) {
        double sqrt = Math.floor(Math.sqrt(n));
        long result = (long) sqrt;

        if(result * result == n){
            result++;
            return result * result;
        }

        return -1;
    }

    // 이것도 되긴된다. 처음에 for문에서 int형으로 했는데 long으로 해주어야 n이 long형 이기때문에 큰 숫자를 반복할 수 있다.
    public static long solution2(long n) {
        long answer = 0;

        for (long i = 1; i <= n+1 ; i++) {
            if (i * i == n) {
                answer = (i + 1) * (i + 1);
                break;
            }
            else answer = -1;
        }
        return answer;
    }

}
