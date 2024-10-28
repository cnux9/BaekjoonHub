class Solution {
    public long solution(long n) {
        double rooted = Math.sqrt(n);
        if (rooted%1==0) {
            return (long)Math.pow(rooted + 1, 2);
        } else {
            return -1;
        }
    }
}