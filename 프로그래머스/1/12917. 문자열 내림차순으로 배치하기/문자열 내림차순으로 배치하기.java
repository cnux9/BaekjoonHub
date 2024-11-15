import java.util.Comparator;
class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        s.chars().boxed().sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue).forEach(c -> sb.append((char)c));
        return sb.toString();
    }
}