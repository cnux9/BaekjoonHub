class Solution {
    public int[] solution(long n) {
        int arraySize = (int)Math.log10(n)+1;
        int[] answer = new int[arraySize];
        for(int i=0;i<arraySize;i++) {
            answer[i] = (int)(n%10);
            n=n/10;
        }
        return answer;
    }
}