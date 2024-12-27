import java.util.HashSet;
import java.util.Set;
import java.lang.Integer;

class Solution {
    public int[] solution(int[] numbers) {
        Set sumNums = new HashSet();
        for (int i=0;i<numbers.length;i++) {
            for (int j=0;j<numbers.length;j++) {
                if (i!=j) {
                    sumNums.add(numbers[i]+numbers[j]);
                }
            }
        }
        return sumNums.stream().sorted().mapToInt(i -> (int)i).toArray();
    }
}