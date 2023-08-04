import java.util.*;

class Solution {
    public int solution(int[][] board) {
        Set<int[]> set = new HashSet<>();
        for(int[] a : returnSet(board, set)) {
            if(a[0] >= 0 && a[0] < board.length && a[1] >= 0 && a[1] < board[0].length)
                board[a[0]][a[1]] = 1;
        }
        
        int zeroCnt = 0;
        for(int[] a : board) {
            for(int b : a) 
                if(b == 0) zeroCnt++;
        }
        
        return zeroCnt;
    }
    
    static Set<int[]> returnSet(int[][] board, Set<int[]> set) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 1) {
                    set.add(new int[]{i - 1, j - 1});
                    set.add(new int[]{i - 1, j});
                    set.add(new int[]{i - 1, j + 1});
                    set.add(new int[]{i, j - 1});
                    set.add(new int[]{i, j + 1});
                    set.add(new int[]{i + 1, j - 1});
                    set.add(new int[]{i + 1, j});
                    set.add(new int[]{i + 1, j + 1});
                }
            }
        }

        return set;
    }
}