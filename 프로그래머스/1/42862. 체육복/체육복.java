import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        
        int answer = n - lost.length;
        List<Integer> reserveList = new ArrayList<>();
        List<Integer> lostList = new ArrayList<>();

        for (int r : reserve) {
            reserveList.add(r);
        }

        for (int l : lost) {
            if (reserveList.contains(l)) {
                reserveList.remove(Integer.valueOf(l));
                answer++;
            } else {
                lostList.add(l);
            }
        }
        
        Collections.sort(reserveList);
        Collections.sort(lostList);

        for (int l : lostList) {
            if (reserveList.contains(l - 1)) {
                answer++;
                reserveList.remove(Integer.valueOf(l - 1));
            } else if (reserveList.contains(l + 1)) {
                answer++;
                reserveList.remove(Integer.valueOf(l + 1));
            }
        }
        
        return answer;
    }
}