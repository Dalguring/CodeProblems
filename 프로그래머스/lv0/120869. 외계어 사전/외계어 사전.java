import java.util.*;

class Solution {
    public int solution(String[] spell, String[] dic) {
        for(String s : dic) {
            int[] array = new int[spell.length];
            for(int i = 0; i < spell.length; i++) {
                if(s.contains(spell[i]))
                    array[i]++;
            }
            if(Arrays.stream(array).sum() == spell.length) 
                return 1;
        }
        
        return 2;
    }
}