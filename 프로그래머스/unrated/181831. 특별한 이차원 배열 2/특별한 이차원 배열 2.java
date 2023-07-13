class Solution {
    public int solution(int[][] arr) {
        int answer = 1;
        try {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if(arr[i][j] != arr[j][i]) throw new Exception();
                }
            }
        } catch (Exception e) {
            answer = 0;
            return 0;
        }
        return answer;
    }
}