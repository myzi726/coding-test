import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arrInt = new int[n];

        for(int i=0; i<n; i++){
            arrInt[i] = sc.nextInt();
        }

        int m = sc.nextInt();

        int sum = 0;

        for(int i=0; i<m; i++){
            int start = sc.nextInt();
            int end = sc.nextInt();

            for(int j=start; j<=end; j++){
                sum += arrInt[j];
            }

            System.out.println(sum);
            sum = 0;
        }




    }
}
