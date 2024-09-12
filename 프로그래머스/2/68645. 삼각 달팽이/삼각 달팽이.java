class Solution {
    public int[] solution(int n) {
        int[][] snailPyramid = new int[n][];

        for (int i = 0; i < snailPyramid.length; i++) {
            snailPyramid[i] = new int[i + 1];
        }

        int number = 1;
        int size = n * (n + 1) / 2;
        int x = 0;
        int y = 0;
        snailPyramid[x][y] = number;
        int[] result = new int[size];

        while (number < size) {
            if (x + 1 < snailPyramid.length && snailPyramid[x + 1][y] == 0) {
                x++;
            } else if (y + 1 < snailPyramid[x].length && snailPyramid[x][y + 1] == 0) {
                y++;
            } else {
                while (snailPyramid[x - 1][y - 1] == 0) {
                    x--;
                    y--;
                    snailPyramid[x][y] = ++number;
                }
                continue;
            }

            snailPyramid[x][y] = ++number;
        }

        int index = 0;

        for (int[] elems : snailPyramid) {
            for (int elem : elems) {
                result[index] = elem;
                index++;
            }
        }
        
        return result;
    }
}