import java.util.ArrayList;

class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for (int i=left;i<=right;i++) {
            // System.out.println(i);
            
            int divisorNumber = 1;
            for (int j=2;j<=i;j++) {
                if (i%j==0) {
                    divisorNumber += 1;
                }
            }
            answer += divisorNumber%2==0 ? i : -i;
        }
        return answer;
    }
    
}

// class PrimeNumber {
//     private static ArrayList<Integer> primeNumbers = new ArrayList<>() {{ add(1); }};
//     private int index = 0;
    
//     public int next() {
//         if (primeNumbers.size()<=index) {
//             append();
//         }
//         int nextNumber = primeNumbers.get(index);
//         index++;
//         return nextNumber;
//     }
    
//     public void append() {
//         int lastElment = primeNumbers.get(primeNumbers.size()-1);
//         int i = lastElment + 1;
//         while(getDivisorNumber(i)>2) {
//             i++;
//             if (i>=1000) {
//                 return;
//             }
//         }
//         primeNumbers.add(i);
//     }
            
//     static public int getDivisorNumber(int number) {
//         PrimeNumber primeNumber = new PrimeNumber();
//         int divisorNumber = 1;
//         while (number != 1) {
//             int nextPrimeNumber = primeNumber.next();
//             if (number % nextPrimeNumber == 0) {
//                 number /= nextPrimeNumber;
//                 divisorNumber += 1;
//             }
//         }
//         return divisorNumber;
//     }
    
    
// }