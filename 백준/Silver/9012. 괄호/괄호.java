import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); //테스트 데이터의 개수

        for (int i = 0; i < T; i++) {
            System.out.println(vps(sc.next()));
        }
    }

    public static String vps(String s) {
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<s.length(); i++) {

            char c = s.charAt(i);

            if(c == '(') {
                stack.push(c);
            }

            else if(stack.empty()) {
                return "NO";
            }

            else {
                stack.pop();
            }
        }

        if(stack.empty()) {
            return "YES";
        }else
            return "NO";
    }
}

