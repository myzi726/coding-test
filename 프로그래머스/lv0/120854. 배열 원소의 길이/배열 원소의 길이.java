class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        
        for(int i=0; i<strlist.length; i++) {
            int n = strlist[i].length();
            
            answer[i] = n;
        }
        
        return answer;
    }
}