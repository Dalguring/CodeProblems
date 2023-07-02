class Solution {
    public int solution(int[] num_list) {
        int oddNum = 0;
        int evenNum = 0;
        
        for (int i = 0; i < num_list.length; i++) {
            if(i % 2 == 0) oddNum += num_list[i];
            else evenNum += num_list[i];
        }
        
        return Math.max(oddNum, evenNum);
    }
}