import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {

        int size = commands.length;

        int[] answer = new int[size];

        for (int x = 0; x < size; x++) {
            int i = commands[x][0];
            int j = commands[x][1];
            int k = commands[x][2];

            int[] tmp = Arrays.copyOfRange(array,i-1,j);

            Arrays.sort(tmp);

            answer[x] = tmp[k-1];

        }


        return answer;
    }
}