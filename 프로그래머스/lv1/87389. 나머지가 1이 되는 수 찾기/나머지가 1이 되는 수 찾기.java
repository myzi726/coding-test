class Solution {
    public int solution(int n) {
        int min = 0;
        
        for(int i=n; i>0; i--) {
            if(n%i == 1)
                min = i;
            
        }
        
        return min;
    }
}