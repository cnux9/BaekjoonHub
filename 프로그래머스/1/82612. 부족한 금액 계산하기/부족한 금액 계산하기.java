class Solution {
    public long solution(int price, int money, int count) {
        return Math.max(0, price*(long)count*(count+1)/2 - money);
    }
}