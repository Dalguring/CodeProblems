class Solution {
    public int[] solution(int[] sequence, int k) {
        int n = sequence.length;
    int left = 0, right = 0;
    int sum = 0;
    int minLength = Integer.MAX_VALUE;
    int[] result = new int[2];

    while (right < n) {
        sum += sequence[right];
        
        while (sum > k && left <= right) {
            sum -= sequence[left];
            left++;
        }
        
        if (sum == k) {
            int currentLength = right - left + 1;
            if (currentLength < minLength) {
                minLength = currentLength;
                result[0] = left;
                result[1] = right;
            }
        }
        
        right++;
    }
        
        return result;
    }
}