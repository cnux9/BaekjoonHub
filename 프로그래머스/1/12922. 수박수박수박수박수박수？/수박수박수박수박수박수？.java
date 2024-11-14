class Solution {
    public String solution(int n) {
        char[] charArr = new char[n];
        Boolean isSu = true;
        for (int i=0;i<n;i++) {
            charArr[i] = isSu ? '수' : '박';
            isSu = !isSu;
        }
        return String.valueOf(charArr);
    }
}