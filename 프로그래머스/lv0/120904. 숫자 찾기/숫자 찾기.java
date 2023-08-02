class Solution {
    public int solution(int num, int k) {
        StringBuilder sb = new StringBuilder(String.valueOf(num));
        
        if(sb.indexOf(String.valueOf(k)) != -1)
            return sb.indexOf(String.valueOf(k)) + 1;
        else 
            return -1;
    }
}