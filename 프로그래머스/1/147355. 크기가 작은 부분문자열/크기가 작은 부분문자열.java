import java.util.stream.IntStream;
class Solution {
    public int solution(String t, String p) {
        int count = 0;
        Long refLong = Long.parseLong(p);
        
        count = (int)IntStream
            .range(0, t.length()-p.length()+1)
            .mapToLong(i -> Long.parseLong(t.substring(i,i+p.length())))
            .filter(n -> n<=refLong)
            .count();
        return count;
    }
}