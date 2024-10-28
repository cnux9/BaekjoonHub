class Solution {
    public long solution(int a, int b) {
        int start, end;
        if (a>b) {
            start = b;
            end = a;
        } else {
            start = a;
            end = b;
        }
        
        long answer = 0;
        for (int i=start;i<=end;i++) {
            answer += i;
        }
        return answer;
    }
}