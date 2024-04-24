import java.util.*;

public class Solution {
    static int count = 0;
    
    public int solution(int n) {
        a(n);
        
        return count + 1;
    }
    
    static int a(int a) {
        if (a < 2) {
            return 0;
        }
        if (a % 2 != 0) {
            a--;
            count++;
        }

        return a(a / 2);
    }
}