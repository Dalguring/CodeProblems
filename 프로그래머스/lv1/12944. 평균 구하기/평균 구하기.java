import java.util.*;

class Solution {
    public double solution(int[] arr) {
        
        return (double)Arrays.stream(arr).sum() / arr.length;
    }
}