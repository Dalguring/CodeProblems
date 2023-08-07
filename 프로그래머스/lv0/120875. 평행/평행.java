import java.util.*;

class Solution {
    public int solution(int[][] dots) {
        int[] select = {1, 2, 3, 4};
        for (int i = 2; i <= select.length; i++) {
            double inclination_1 = (dots[0][1] - dots[i - 1][1]) / (double)(dots[0][0] - dots[i - 1][0]);
            int[] target = notInclude(0, i - 1);
            double inclination_2 = (dots[target[0]][1] - dots[target[1]][1]) / (double)(dots[target[0]][0] - dots[target[1]][0]);
            if(inclination_1 == inclination_2)
                return 1;
        }
        return 0;
    }
    
    static int[] notInclude(int first, int second) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            if(i == first || i == second)
                continue;
            list.add(i);
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}