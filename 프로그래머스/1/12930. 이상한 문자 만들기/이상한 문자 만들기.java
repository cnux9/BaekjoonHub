// import java.util.Arrays;

class Solution {
    public String solution(String s) {
        int start = -1;//임의값
        int end = -1;
        StringBuilder sb = new StringBuilder(s);
        while (true) {
            boolean hasStart = false;
            for (int i = end+1;i<s.length();i++) {
                if (s.charAt(i) != ' ') {
                    start = i;
                    hasStart = true;
                    break;
                }
            }
            if (!hasStart) {
                return sb.toString();
            }
            
            boolean hasEnd = false;
            for (int i = start+1;i<s.length();i++) {
                if (s.charAt(i) == ' ') {
                    end = i;
                    hasEnd = true;
                    break;
                }
            }
            if (!hasEnd) {
                end = s.length();
            }


            for (int i = 0;i<end-start;i++) {
                if (i%2==0) {
                    sb.setCharAt(start+i, Character.toUpperCase(s.charAt(start+i)));
                } else {
                    sb.setCharAt(start+i, Character.toLowerCase(s.charAt(start+i)));
                }
            }
        }
        
        // String[] words = s.split(" ");
        // // words = Arrays.stream(words).filter(w -> w.length()!=0).toArray(String[]::new);
        // String[] newWords = new String[words.length];
        // for (int i = 0;i<words.length;i++) {
        //     String word = words[i];
        //     StringBuilder sb = new StringBuilder();
        //     for (int j=0;j<word.length();j++) {
        //         char c = word.charAt(j);
        //         if (Character.isLetter(c)) {
        //             sb.append(j%2==1 ? Character.toLowerCase(c) : Character.toUpperCase(c));
        //         } else {
        //             sb.append(c);
        //         }
        //     }
        //     newWords[i] = sb.toString();
        // }
        // return String.join(" ", newWords);
    }
}