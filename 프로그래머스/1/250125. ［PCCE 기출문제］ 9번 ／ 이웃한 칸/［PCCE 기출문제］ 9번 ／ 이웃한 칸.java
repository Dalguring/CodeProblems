class Solution {
    public int solution(String[][] board, int h, int w) {
        int[] heightCtl = {-1, 1, 0, 0};
        int[] widthCtl = {0, 0, 1, -1}; // 위 아래 오른쪽 왼쪽
        int count = 0;
        String color = board[h][w];

        for (int i = 0; i < widthCtl.length; i++) {
            int pointH = h + heightCtl[i];
            int pointW = w + widthCtl[i];

            if (pointW >= 0 && pointW < board.length && pointH >= 0 && pointH < board[0].length) {
                if (board[pointH][pointW].equals(color)) {
                    count++;
                }
            }
        }
        
        return count;
    }
}