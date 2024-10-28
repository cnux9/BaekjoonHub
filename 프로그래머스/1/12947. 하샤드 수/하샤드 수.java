import java.util.Arrays;
import java.util.stream.Stream;

class Solution {
    public boolean solution(int x) {
        NumberArray numberArray = new NumberArray(x);
        int sum = numberArray.sum();
        return x%sum==0;
    }
}

class NumberArray {
    int[] mArray;
    
    public NumberArray(int number) {
        int length = (int)Math.log10(number) + 1;
        mArray = new int[length];
        for (int i=0; i<length; i++) {
            this.mArray[i] = number%10;
            number /= 10;
        }
    }
    
    public int sum() {
        return Arrays.stream(this.mArray).sum();
    }
    
}