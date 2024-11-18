class Solution {
    public int solution(String t, String p) {
        int count = 0;
        int refInt;
        // try {
        //     refInt = Integer.parseInt(p);
        // } catch (Exception e) {
        //     return 0;
        // }
        for (int i = 0;i<=t.length()-p.length();i++) {
            String substring = t.substring(i, i+p.length());
            if (substring.compareTo(p)<=0) {
                count++;
            }
        }
        return count;
    }
}