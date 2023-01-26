import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        List<Integer> list = new ArrayList<Integer>();
        
        for(int i = 0; i < numbers.length; i++) {
            for(int j = i+1; j < numbers.length; j++) {
                list.add(numbers[i]*numbers[j]);
            }
        }
        
        Collections.sort(list);
        answer = list.get(list.size()-1);
        
        return answer;
    }
}