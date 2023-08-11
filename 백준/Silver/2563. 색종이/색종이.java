import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); //색종이의 개수를 입력 받음

        int area = 0; // 색종이가 덮인 면적을 담기 위한 변수 선언

        boolean [][]arr = new boolean[100][100]; //도화지의 크기는 100x100으로 고정되어 있음

        for(int i=0; i<N; i++) {
            int x_point = sc.nextInt();
            int y_point = sc.nextInt();
            for(int x = x_point; x<x_point+10; x++) {
                for(int y = y_point; y<y_point+10; y++){
                    if(!arr[y][x]) { //bool 배열은 기본적으로 false 값으로 초기화 되어 있음, 해당하는 위치의 면적 값을 true 값으로 변경해줌
                        area++;
                        arr[y][x] = true; //true 값으로 변경 된 위치는 중복되어도 이미 true 값이기 때문에 1번만 카운트 됨
                    }
                }
            }

        }
        System.out.println(area);

    }
}