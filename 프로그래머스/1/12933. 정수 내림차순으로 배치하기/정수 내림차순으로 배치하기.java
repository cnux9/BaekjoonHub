import java.util.Arrays;

class Solution {
    public long solution(long n) {
        int length = (int)Math.log10(n) + 1;
        int[] array = new int[length];
        for (int i=0; i<length; i++) {
            array[i]=(int)(n%10);
            n=n/10;
            System.out.println("" + n + " " + array[i]);
        }
        
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        
        long answer = 0;
        for (int i=0; i<length; i++) {
            answer += array[i]*pow10(i);
            // System.out.println(Math.pow(10, i));
            // System.out.println(Math.pow(10, 10));
        }
        return answer;
    }
    
    private long pow10(int n) {
        long returnValue = 1;
        for (int i=0; i<n; i++) {
            returnValue *= 10;
        }
        return returnValue;
    }
}