class Solution {
    boolean solution(String s) {
        int cnt = 0;
        
        for(int i = 0; i<s.length(); i++) {
            char c = s.charAt(i);
            
            if(c == 'p' || c == 'P')
                cnt++;
            if(c == 'y' || c == 'Y')
                cnt--;
        }
        
        if(cnt == 0)
            return true;
        else return false;

    }
}