class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i=n/2;i>0;i--) {
            answer += i;
        }
        return answer*2;
    }
}