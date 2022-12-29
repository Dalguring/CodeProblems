import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int n) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) answer.add(i);
        }
        
        return answer;
    }
}