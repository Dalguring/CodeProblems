import java.util.*;

class Solution {
    public Set solution(int[] numbers) {
        Set<Integer> uniqueNumSet = new TreeSet<Integer>();
		List<Integer> numbersToList = new ArrayList<Integer>();
		for(int i = 0; i < numbers.length; i++) numbersToList.add(numbers[i]);
		
		for(int i = 0; i < numbersToList.size(); i++) {
			if(i == numbersToList.size()) break;
			for(int j = i+1; j < numbersToList.size(); j++) {
				uniqueNumSet.add(numbersToList.get(i) + numbersToList.get(j));
			}
		}
        return uniqueNumSet;
    }
}