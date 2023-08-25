import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 돌의 개수

        if(n % 2 == 1) {
            System.out.println("SK");
        }else System.out.println("CY");
    }
}
