/**
 * Yang
 */
public class Yang {

    public static void main(String[] args) {

        int money = solution(64, 6);

        System.out.println("지불 금액 : " + money);


    }

     static int solution(int n, int k) {
            int answer = 0;
        
            int y = n * 12000;
            int d = k * 2000;
            
            answer = y + d ;
                  
            if(n>=10) {
                answer = answer -  (n/10) * 2000;
            }
            
            return answer;
        }
    
}