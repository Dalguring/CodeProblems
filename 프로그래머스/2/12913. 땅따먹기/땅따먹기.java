import java.util.Arrays;

class Solution {
    int solution(int[][] land) {
        if (land.length == 1) {
            return findMax(land[0], -1);
        }

        for (int i = 1; i < land.length; i++) {
            for (int j = 0; j < land[i].length; j++) {
                land[i][j] += findMax(land[i - 1], j);
            }
        }

        int max = findMax(land[land.length - 1], -1);

        return max;
    }
    
    static int findMax(int[] copyLand, int division) {
        int max = 0;

        for (int i = 0; i < copyLand.length; i++) {
            if (max < copyLand[i]) {
                if (division == i) {
                    continue;
                }
                max = copyLand[i];
            }
        }

        return max;
    }
}