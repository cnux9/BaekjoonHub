import java.util.Arrays;
import java.util.Comparator;
class Solution {
    public String[] solution(String[] strings, int n) {
        Comparator<String> comparator =  Comparator
            .comparing((String a) -> a.chars().skip(n).findFirst().orElse(0))
            .thenComparing((String a) -> a);
        String[] answer = Arrays.stream(strings).sorted(comparator).toArray(String[]::new);
        return answer;
    }
}