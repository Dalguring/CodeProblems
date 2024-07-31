import java.util.ArrayList;
import java.util.List;

class Solution {
    
    static int zeros = 0;
    static int ones = 0;
    static int[][] quadSquare;
    
    public int[] solution(int[][] arr) {
        
        quadSquare = arr;
        quadTree(0, arr[0].length, 0, arr.length);
        
        return new int[]{zeros, ones};
    }
    
    static void quadTree(int xFrom, int xTo, int yFrom, int yTo) {
        List<Integer> numberList = new ArrayList<>();

        for (int i = xFrom; i < xTo; i++) {
            for (int j = yFrom; j < yTo; j++) {
                numberList.add(quadSquare[i][j]);
            }
        }

        if (numberList.size() == 1) {
            if (numberList.get(0) == 0) {
                zeros++;
            } else {
                ones++;
            }

            return;
        }

        boolean allMatch = numberList.stream()
                    .allMatch(number -> number == numberList.get(0));

        if (allMatch) {
            if (numberList.get(0) == 0) {
                zeros++;
            } else {
                ones++;
            }

            return;
        }

        int midX = xFrom + (xTo - xFrom) / 2;
        int midY = yFrom + (yTo - yFrom) / 2;

        quadTree(xFrom, midX, yFrom, midY);
        quadTree(xFrom, midX, midY, yTo);
        quadTree(midX, xTo, yFrom, midY);
        quadTree(midX, xTo, midY, yTo);
    }
}