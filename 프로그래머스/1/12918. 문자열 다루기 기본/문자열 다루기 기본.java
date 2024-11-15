import java.util.regex.Pattern;
class Solution {
    final private Pattern PATTERN = Pattern.compile("^[\\d]*$");
    public boolean solution(String s) {
        if (!PATTERN.matcher(s).matches()) {
            return false;
        }
        if (s.length()!=4 && s.length()!=6) {
            return false;
        }
        return true;
    }
}