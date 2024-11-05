import java.util.stream.IntStream;
class Solution {
    public int[] solution(int[] arr) {
        if (arr.length==1) {
            return new int[] {-1};
        }
        int minimumNum = IntStream.of(arr).min().getAsInt();
        int[] answer = IntStream.of(arr).filter(n -> n!=minimumNum).toArray();
        return answer;
    }
}