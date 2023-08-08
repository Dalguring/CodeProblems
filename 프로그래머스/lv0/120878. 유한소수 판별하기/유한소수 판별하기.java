import java.util.*;

class Solution {
    public int solution(int a, int b) {
        int gcd = gcd(b, a);
        b /= gcd;

        boolean[] isPrime = new boolean[b + 1];
        getPrime(isPrime, b);
        
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < isPrime.length; i++) {
            if(!isPrime[i])
                list.add(i);
        }
        
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) == 2 || list.get(i) == 5)
                continue;
            if(b % list.get(i) == 0)
                return 2;
        }
        return 1;
    }
    
    static int gcd(int b, int a) {
        if(b % a == 0)
            return a;

        return gcd(a, b % a);
    }

    static boolean[] getPrime(boolean[] isPrime, int b) {
        isPrime[0] = true;
        isPrime[1] = true;

        for (int i = 2; i <= Math.sqrt(b); i++) {
            if(!isPrime[i]) {
                for (int j = i * i; j <= b; j += i)
                    isPrime[j] = true;
            }
        }

        return isPrime;
    }
}