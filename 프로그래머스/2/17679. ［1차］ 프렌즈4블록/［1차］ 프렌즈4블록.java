import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    static char[][] friendsBoard;
    static int count = 0;
    
    public int solution(int m, int n, String[] board) {
        friendsBoard = new char[m][n];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length(); j++) {
                friendsBoard[i][j] = board[i].charAt(j);
            }
        }

        boolean[][] friendsToPop;

        do {
            friendsToPop = new boolean[m][n];
            getPopBlocks(friendsToPop);
            setBlocks(friendsToPop);
        } while (!isAllFalse(friendsToPop));
        
        return count;
    }
    
    static void getPopBlocks(boolean[][] friendsToPop) {

        for (int i = 0; i < friendsBoard.length - 1; i++) {
            for (int j = 0; j < friendsBoard[i].length - 1; j++) {
                char friend = friendsBoard[i][j];
                if (friend == ' ') {
                    continue;
                }

                boolean isTrue = friendsBoard[i][j + 1] == friend
                        && friendsBoard[i + 1][j] == friend
                        && friendsBoard[i + 1][j + 1] == friend;

                if (isTrue) {
                    friendsToPop[i][j] = true;
                    friendsToPop[i + 1][j] = true;
                    friendsToPop[i][j + 1] = true;
                    friendsToPop[i + 1][j + 1] = true;
                }
            }
        }

    }

    static boolean isAllFalse(boolean[][] friendsToPop) {
        boolean allFalse = true;

        for (boolean[] booleans : friendsToPop) {
            for (boolean aBoolean : booleans) {
                if (aBoolean) {
                    allFalse = false;
                    break;
                }
            }

            if (!allFalse) {
                return allFalse;
            }
        }

        return allFalse;
    }

    static void setBlocks(boolean[][] friendsToPop) {
        for (int i = 0; i < friendsToPop[0].length; i++) {
            Queue<Character> queue = new LinkedList<>();

            for (int j = friendsToPop.length - 1; j >= 0; j--) {
                if (friendsToPop[j][i]) {
                    count++;
                } else {
                    queue.offer(friendsBoard[j][i]);
                }
            }

            for (int j = friendsToPop.length - 1; j >= 0; j--) {
                if (!queue.isEmpty()) {
                    friendsBoard[j][i] = queue.poll();
                } else {
                    friendsBoard[j][i] = ' ';
                }
            }
        }
    }
}