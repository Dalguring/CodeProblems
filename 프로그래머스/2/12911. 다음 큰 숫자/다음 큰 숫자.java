class Solution {
    public int solution(int n) {
        int count_one = Integer.bitCount(n);
        int number = 0;

        for (int i = n + 1; i <= 1000000; i++) {

            int count = Integer.bitCount(i);

            if (count == count_one) {
                number = i;
                break;
            }
        }
        
        return number;
    }
}