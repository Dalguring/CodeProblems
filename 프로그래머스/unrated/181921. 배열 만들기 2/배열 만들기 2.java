import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> list = new ArrayList<Integer>();
        if(l == 5) list.add(5);
		for(int i = l + 5 - (l % 5); i <= r; i += 5) {
			int checkCnt = 0;
			for(int j = 0; j < String.valueOf(i).length(); j++) {
				if(String.valueOf(i).charAt(j) == '0' || String.valueOf(i).charAt(j) == '5') {
					checkCnt++;
				} else 	break;
			}
			if(checkCnt == String.valueOf(i).length()) list.add(i);
		}
        if(list.size() == 0) list.add(-1);
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}