import java.util.*;

class Solution {
    public int solution(int n) {

        return n * 6 / GCD(n, 6) / 6;
    }
    
    static int GCD(int n, int num) {
        if(n % num == 0)
            return num;
        return GCD(num, n % num);
    }
}