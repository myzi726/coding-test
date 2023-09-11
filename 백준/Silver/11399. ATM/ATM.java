import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 돈을 뽑는 사람의 수

        int[] p = new int[N];

        for(int i=0; i<N; i++){
            p[i] = sc.nextInt();
        }

        Arrays.sort(p);

        int sum = 0;

        for(int i=0; i<N; i++){
            sum += p[i] * (N-i);

        }

        System.out.println(sum);
    }
}
