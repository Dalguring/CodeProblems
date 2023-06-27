class Solution {
    public int solution(int[] arr, int idx) {
        int answer = 0;
        
        for (int i = idx; i < arr.length; i++) {
            if(arr[i] == 1) {
                answer = i;
                return i;
            } 
        }
        
        return -1;
    }
}