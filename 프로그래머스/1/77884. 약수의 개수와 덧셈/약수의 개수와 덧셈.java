import java.util.ArrayList;

class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for (int i=left;i<=right;i++) {
            // System.out.println(i);
            
            int divisorNumber = 1;
            for (int j=2;j<=i;j++) {
                if (i%j==0) {
                    divisorNumber += 1;
                }
            }
            answer += divisorNumber%2==0 ? i : -i;
        }
        return answer;
    }
    
}