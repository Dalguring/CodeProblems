class Solution {
    public int[][] solution(int[][] arr) {
        int line = arr[arr.length - 1].length;
        int row = arr.length;

        int newArray = Math.max(line, row);
        int[][] answer = new int[newArray][newArray];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                answer[i][j] = arr[i][j];
            }
        }
        
        return answer;
    }
}