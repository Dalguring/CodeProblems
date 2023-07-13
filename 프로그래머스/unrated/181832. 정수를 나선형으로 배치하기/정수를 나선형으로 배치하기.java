class Solution {
    public int[][] solution(int n) {
        int control = 1;
        int controlX = n - 1;
        int controlY = n - 1;
        int cycle = 0;
        int[][] answer = new int[n][n];

        while(control <= n * n) {
            for(int i = cycle; i <= controlY; i++) {
                answer[cycle][i] = control;
                control++;
            }
            control--;
            for(int i = cycle; i <= controlX; i++) {
                answer[i][controlX] = control;
                control++;
            }
            control--;
            for (int i = controlY; i >= cycle; i--) {
                answer[controlY][i] = control;
                control++;
            }
            control--;
            cycle++;
            for (int i = controlX; i >= cycle; i--) {
                answer[i][cycle - 1] = control;
                control++;
            }
            controlX--;
            controlY--;
        }
        
        return answer;
    }
}