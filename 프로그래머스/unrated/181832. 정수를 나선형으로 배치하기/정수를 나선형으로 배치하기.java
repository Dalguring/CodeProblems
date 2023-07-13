class Solution {
    public int[][] solution(int n) {
        int control = 1;
        int controlSpot = n - 1;
        int cycle = 0;
        int[][] answer = new int[n][n];

        while(control <= n * n) {
            for(int i = cycle; i <= controlSpot; i++) {
                answer[cycle][i] = control;
                control++;
            }
            control--;
            for(int i = cycle; i <= controlSpot; i++) {
                answer[i][controlSpot] = control;
                control++;
            }
            control--;
            for (int i = controlSpot; i >= cycle; i--) {
                answer[controlSpot][i] = control;
                control++;
            }
            control--;
            cycle++;
            for (int i = controlSpot; i >= cycle; i--) {
                answer[i][cycle - 1] = control;
                control++;
            }
            controlSpot--;
        }
        
        return answer;
    }
}