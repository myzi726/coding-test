import java.util.Arrays;

public class test02 {

    public static void main(String[] args){

        int[] a = solution(15000);

        System.out.println(Arrays.toString(a));
    }

    static int[] solution(int money) {
        int[] answer = new int[2];

        answer[0] = money / 5500;
        answer[1] = money % 5500;
        
        return answer;
    }
}