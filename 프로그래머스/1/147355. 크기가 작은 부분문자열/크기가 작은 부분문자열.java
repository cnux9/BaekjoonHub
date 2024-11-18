class Solution {
    public int solution(String t, String p) {
        // if (t.equals("")) {
        //     return 0;
        // }
        int count = 0;
        for (int i = 0;i<=t.length()-p.length();i++) {
            int substringInt = Integer.parseInt(t.substring(i, i+p.length()));
            if (substringInt<=Integer.parseInt(p)) {
                count++;
            }
        }
        return count;
    }
}