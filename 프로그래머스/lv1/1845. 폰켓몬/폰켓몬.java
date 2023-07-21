import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] nums) {
        Set<Integer> set = new HashSet<>(Arrays.stream(nums).boxed().collect(Collectors.toList()));
        int maxPokemon = nums.length / 2;
        
        if(set.size() >= maxPokemon)
            return maxPokemon;
        else return set.size();
    }
}