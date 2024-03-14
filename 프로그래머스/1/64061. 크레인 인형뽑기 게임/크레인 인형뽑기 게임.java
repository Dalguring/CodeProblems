import java.util.Stack;

class Solution {
    public int solution(int[][] board, int[] moves) {
        Stack<Integer> bucket = new Stack<>();
        int answer = 0;

        for (int move : moves) {
            for (int i = 0; i < board.length; i++) {
                if (board[i][move - 1] != 0) {
                    if (!bucket.isEmpty() && bucket.peek().equals(board[i][move - 1])) {
                        bucket.pop();
                        answer += 2;
                    } else {
                        bucket.push(board[i][move - 1]);
                    }
                    board[i][move - 1] = 0;
                    break;
                }
            }
        }
        
        return answer;
    }
}