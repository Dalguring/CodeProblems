class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        
        for(int[] ints : queries) {
            for (int i = ints[0]; i <= ints[1] ; i++) {
                arr[i] += 1;
            }
        }
        
        return arr;
    }
}