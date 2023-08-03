class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int x = 0;
        int y = 0;

        for(String s : keyinput) {
            switch (s) {
                case "left" : x -= 1; break;
                case "right": x += 1; break;
                case "up"   : y += 1; break;
                case "down" : y -= 1; break;
            }
            if(x < -(board[0] / 2))
                x += 1;
            else if(x > board[0] / 2)
                x -= 1;
            else if(y < -(board[1]) / 2)
                y += 1;
            else if(y > board[1] / 2)
                y -= 1;
        }
        
        return new int[]{x, y};
    }
}