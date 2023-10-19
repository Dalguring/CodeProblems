import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int max = Integer.MIN_VALUE;
        Point desc = null;
        
        for (int i = 0; i < sizes.length; i++) {
            max = Math.max(Math.max(sizes[i][0], sizes[i][1]), max);
            if (max == sizes[i][0] || max == sizes[i][1])
                desc = new Point(max, i);
        }

        int max2 = sizes[desc.index][0] == desc.number ? sizes[desc.index][1] : sizes[desc.index][0];

        for (int i = 0; i < sizes.length; i++)
            max2 = Math.max(Math.min(sizes[i][0], sizes[i][1]), max2);

        return max * max2;
    }
}

class Point {
    int number;
    int index;

    public Point(int number, int index) {
        this.number = number;
        this.index = index;
    }
}