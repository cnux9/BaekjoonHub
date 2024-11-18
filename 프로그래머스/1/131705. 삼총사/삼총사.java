class Solution {
    public int solution(int[] number) {
        int count = 0;
        for (int i = 0;i<number.length;i++) {
            for (int j = i+1;j<number.length;j++) {
                for (int k = j+1;k<number.length;k++) {
                    if (0==number[i]+number[j]+number[k] ) {
                        if (i!=j && i!=k && j!=k) {
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }
}