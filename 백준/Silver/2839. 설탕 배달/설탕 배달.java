import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sugar = 0;

        while(true) {
            if (N % 5 == 0) {
                System.out.println(N / 5 + sugar);
                break;
            } else if (N < 0) {
                System.out.println(-1);
                break;
            }
            N -= 3;
            sugar++;
        }



    }
}
