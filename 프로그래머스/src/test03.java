public class test03 {
    public static void main(String[] args) {

        int[] num = {1,2,3,4,5,6,7,8,9,10};

        double avg = solution(num);

        System.out.println("평균 : " +  avg);


    }

    static double solution(int[] numbers) {
        double answer = 0;
        
        for(int i=0; i<numbers.length; i++) {
            answer += numbers[i];
        }
        
        answer = answer / numbers.length;
        
        return answer;
        }
 }