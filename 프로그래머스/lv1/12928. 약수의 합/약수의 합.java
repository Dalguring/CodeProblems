import java.util.*;

class Solution {
    public int solution(int n) {
        if(n == 1)
            return 1;
        
        Set<Integer> set = new HashSet<>();
        for (int i = 1; i < n / 2; i++) {
            if(n % i == 0) {
                set.add(i);
                set.add(n / i);
            }
        }
        int answer = 0;
        for(int i : set) 
            answer += i;
        
        return answer;
    }
}