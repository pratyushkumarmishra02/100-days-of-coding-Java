public class GcdOfOddEvenSums {

    public int gcdOfOddEvenSums(int n) {
        int sumOdd = 0, sumEven = 0;
        for (int i = 1; i <= 2 * n; i++) {
            if (i % 2 == 0) {
                sumEven += i;
            } else {
                sumOdd += i;
            }
        }
        int gcd = GCD(sumOdd, sumEven);
        return gcd;
    }

    public int GCD(int o, int e) {
        int minNum = Math.min(o, e);
        int gcd = 0;
        for (int i = minNum; i >= 1; i--) {
            if (o % i == 0 && e % i == 0) {
                gcd = i;
                break;
            }
        }
        return gcd;
    }

    public static void main(String[] args) {
        GcdOfOddEvenSums solver = new GcdOfOddEvenSums();

        
        int n1 = 3;
        System.out.println("Test Case 1 (n = " + n1 + ") Output: " + solver.gcdOfOddEvenSums(n1)); 

        int n2 = 2;
        System.out.println("Test Case 2 (n = " + n2 + ") Output: " + solver.gcdOfOddEvenSums(n2)); 
    }
}