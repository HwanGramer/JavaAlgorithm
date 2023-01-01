public class PandYcount {

    public static void main(String[] args){
        solution("PpooYy");
    }

    public static boolean solution(String str){
        int[] py = new int[2];

        for(int i=0; i < str.length(); i++){
            if('P' == str.charAt(i) || 'p' == str.charAt(i))
                py[0]++;
            if('y' == str.charAt(i) || 'Y' == str.charAt(i))
                py[1]++;
        }

        return py[0] == py[1] ? true : false;
    }
}
