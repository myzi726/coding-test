import java.util.*;

class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        
        int n = Arrays.asList(seoul).indexOf("Kim");
        
        answer = "김서방은 " + n +"에 있다";
        
        return answer;
    }
}