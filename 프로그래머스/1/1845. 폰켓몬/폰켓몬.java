import java.util.*;

class Solution {
    public int solution(int[] nums) {
        Map<Integer, Integer> counter = new HashMap<>();
        
        for (int num : nums)
            counter.put(num, counter.getOrDefault(num, 0) + 1);

        int getMax = nums.length / 2;
        
        if (counter.size() < getMax)
            return counter.size();
        else return getMax;
    }
}