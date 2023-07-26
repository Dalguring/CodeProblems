class Solution {
    public int solution(int[] numbers, int k) {
        int control = 1;
        int result = 0;
        int index = 2 * control - 2;
        while(control <= k) {
            if(index > numbers.length - 1)
                index %= numbers.length;
            result = numbers[index];

            control++;
            index = 2 * control - 2;
        }
        
        return result;
    }
}