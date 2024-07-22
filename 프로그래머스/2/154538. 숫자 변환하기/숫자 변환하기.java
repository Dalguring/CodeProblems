import java.util.Arrays;

class Solution {
    public int solution(int x, int y, int n) {
        int[] array = new int[y + 1];
        Arrays.fill(array, Integer.MAX_VALUE);
        array[x] = 0;

        for (int i = x; i < y; i++) {
            if (array[i] == Integer.MAX_VALUE) {
                continue;
            }
            if (i + n <= y) {
                array[i + n] = Math.min(array[i + n], array[i] + 1);
            }
            if (i * 2 <= y) {
                array[i * 2] = Math.min(array[i * 2], array[i] + 1);
            }
            if (i * 3 <= y) {
                array[i * 3] = Math.min(array[i * 3], array[i] + 1);
            }
        }
        
        return array[y] == Integer.MAX_VALUE ? -1 : array[y];
    }
}