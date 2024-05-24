import java.util.StringTokenizer;

class Solution {
    private static int primes = 0;
    
    public int solution(int n, int k) {
        StringTokenizer st = new StringTokenizer(Integer.toString(n, k), "0");
        while (st.hasMoreTokens()) {
            isPrime(st.nextToken());
        }
        
        return primes;
    }
    
    static void isPrime(String number) {
        long num = Long.parseLong(number);
        if (num < 2) {
            return;
        }

        for (long i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return;
            }
        }

        primes++;
    }
}