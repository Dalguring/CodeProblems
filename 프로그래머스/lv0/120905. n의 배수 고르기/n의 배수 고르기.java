import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int n, int[] numlist) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i : numlist) {
            if(i % n == 0) arr.add(i);
        }
        
        return arr;
    }
}