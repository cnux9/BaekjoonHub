class Solution {
    public int[] solution(int n, int m) {
        int max = 1;
        for (int i=2;i<=m && i<=n;i++) {
            System.out.println(i);
            if (n%i==0 && m%i==0) {
                max = i;
            }
        }
        
        int i = n;
        while (i%n!=0 || i%m!=0) {
            i++;
        }
        int min = i;
        int[] answer = {max, min};
        return answer;
    }
}