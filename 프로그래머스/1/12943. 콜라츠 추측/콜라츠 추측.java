class Solution {
    static int count = 0;
    
    public int solution(int num) {
        collatzNum(num);
        return count;
    }
    
    static void collatzNum(long number) {
        if (number == 1)
            return;

        if (count > 500) {
            count = -1;
            return;
        }

        count++;
        if (number % 2 == 0) {
            collatzNum(number / 2);
        } else {
            collatzNum(3 * number + 1);
        }
    }
}