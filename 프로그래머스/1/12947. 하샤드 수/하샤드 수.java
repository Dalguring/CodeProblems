class Solution {
    public boolean solution(int x) {
        char[] charset = String.valueOf(x).toCharArray();
        int sum = 0;

        for (char c : charset) {
            sum += Character.getNumericValue(c);
        }
        
        return x % sum == 0;
    }
}