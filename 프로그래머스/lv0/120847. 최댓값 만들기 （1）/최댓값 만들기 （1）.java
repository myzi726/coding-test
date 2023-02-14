import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        
        int nl = numbers.length;

        return numbers[nl-2]*numbers[nl-1];
    }
}