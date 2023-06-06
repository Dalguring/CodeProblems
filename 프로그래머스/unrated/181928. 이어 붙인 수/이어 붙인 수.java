class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String oddNum = "";
        String evenNum = "";
        
        for(int i : num_list) {
            if(i % 2 == 0) evenNum += i;
            else oddNum += i;
        }
        return Integer.parseInt(evenNum) + Integer.parseInt(oddNum);
    }
}