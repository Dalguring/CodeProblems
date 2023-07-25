class Solution {
    public int solution(int balls, int share) {
        double numerator = 1;
        double denominator = 1;

        for (int i = 0; i < share; i++) {
            numerator *= balls - i;
            denominator *= share - i;
        }
        
        return (int)(numerator / denominator);
    }
}