import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 정수 배열의 길이 선언

        int[] A = new int[N];
        int[] B = new int[N];

        StringTokenizer stA = new StringTokenizer(br.readLine());
        StringTokenizer stB = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(stA.nextToken());
        }

        for (int i = 0; i < N; i++) {
            B[i] = Integer.parseInt(stB.nextToken());
        }

        Integer[] tmpB = Arrays.stream(B).boxed().toArray(Integer[]::new);

        Arrays.sort(A);

        Arrays.sort(tmpB, Comparator.reverseOrder());

        int sum = 0;

        for(int i=0; i<N; i++){
            sum += A[i]*tmpB[i];
        }

        System.out.println(sum);
    }
}
