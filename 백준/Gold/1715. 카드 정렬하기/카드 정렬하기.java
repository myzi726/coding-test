import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
    static int N, res = 0;
    static PriorityQueue<Integer> q = new PriorityQueue<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        int input;

        for (int i = 0; i < N; i++) {
            input = Integer.parseInt(br.readLine());

            q.offer(input);
        }
        add();
    }

    static void add() {
        while (q.size() > 1) {
            int a = q.poll();
            int b = q.poll();
            res += (a+b);
            q.add(a+b);
        }

        System.out.println(res);
    }
}