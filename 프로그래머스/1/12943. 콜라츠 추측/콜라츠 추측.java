class Solution {
    public int solution(int numInt) {
        if (numInt==1) {
            return 0;
        }
        long num = numInt;
        for(int i=1;i<=500;i++) {
            num = num%2==0 ? num/2 : num*3+1;
            if (num==1) {
                return i;
            }
        }
        return -1;
    }
}