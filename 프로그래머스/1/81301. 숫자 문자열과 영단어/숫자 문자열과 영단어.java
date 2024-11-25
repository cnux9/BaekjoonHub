import java.util.Map;
class Solution {
    public int solution(String s) {
        Map<String, String> map = Map.of(
            "0", "zero",
            "1", "one",
            "2", "two",
            "3", "three",
            "4", "four",
            "5", "five",
            "6", "six",
            "7", "seven",
            "8", "eight",
            "9", "nine"
        );
        for (String key:map.keySet()) {
            String value = map.get(key);
            s=s.replace(value, key);
        }
        return Integer.parseInt(s);
    }
}