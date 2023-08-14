import java.util.*;

class Solution {
    public long solution(long n) {
        String []list = Long.toString(n).split("");
        Arrays.sort(list, Collections.reverseOrder());

        String str = String.join("", list);
        long answer = Long.parseLong(str);
        
        return answer;
    }
}