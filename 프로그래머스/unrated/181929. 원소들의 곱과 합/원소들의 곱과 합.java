class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int multi = 1;
        int pow = 0;
        
        for(int i : num_list) {
            multi *= i;
            pow += i;
        }
        pow = (int)(Math.pow(pow, 2));
        return multi > pow ? 0 : 1;
    }
}