class Solution {
    public int solution(int n) {
        int trits = (int)(Math.log(n)/Math.log(3));
        // System.out.println(trits);
        int answer = 0;
        for (int i = 0;i<=trits;i++) {
            int target = (int)Math.pow(3, trits-i);
            int a = n/target;
            int b = (int)Math.pow(3, i);
            answer += a*b;
            n %= target;
            // System.out.println("a: " + a + ", b: "+ b + ", c: " + answer);
        }
        return answer;
    }
}