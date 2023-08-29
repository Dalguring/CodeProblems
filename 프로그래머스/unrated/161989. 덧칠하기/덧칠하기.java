import java.util.*;

class Solution {
    public int solution(int n, int m, int[] section) {
        int paint = 0;
        int[] wall = new int[n];
        Arrays.fill(wall, 1);
        for (int i = 0; i < section.length; i++)
            wall[section[i] - 1] = 0;

        while (true) {
            paint++;
            int index = 0;
            for (int i = 0; i < wall.length; i++) {
                if (wall[i] == 0) {
                    index = i;
                    break;
                }
            }
            Arrays.fill(wall, index, Math.min(index + m, wall.length), 1);
            int sum = 0;
            for (int i : wall)
                sum += i;
            if(sum == wall.length)
                break;
        }
        
        return paint;
    }
}