import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;

        PriorityQueue<Integer> que = new PriorityQueue<>(); // 우선순위 큐 생성

        for(int i=0; i<scoville.length; i++) {
            que.add(scoville[i]); // 스코빌 지수 값들을 큐에 삽입
        }

        while(que.peek() < K) { //큐의 첫번째 값을 반환하여 K보다 작을때동안 반복
            if (que.size() == 1)
                return -1;

            que.add(que.poll() + que.poll() * 2);
            answer++;
        }


        return answer;
    }
}