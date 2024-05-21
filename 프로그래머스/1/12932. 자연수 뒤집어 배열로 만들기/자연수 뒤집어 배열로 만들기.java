class Solution {
    public int[] solution(long n) {
        int[] answer = {};
        int cnt = 0;
        long nm = n;
        
        while(nm>0) {
            cnt++;
            nm/=10;
        }
        
        answer = new int[cnt];
        
        for(int i=0; i<answer.length; i++){
            answer[i] = (int)(n % 10);
            n = n / 10;
        }
        
        return answer;
    }
}