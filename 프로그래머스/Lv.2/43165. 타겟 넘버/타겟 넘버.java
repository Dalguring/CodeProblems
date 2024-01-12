class Solution {
    static int result = 0;
    public int solution(int[] numbers, int target) {
        dfs(0, numbers, target, 0);
        return result;
    }
    
    static void dfs (int index, int[] numbers, int target, int sum) {
        if (index == numbers.length) {
            if (target == sum) {
                result++;
            }
            return;
        }

        dfs(index + 1, numbers, target, sum + numbers[index]);
        dfs(index + 1, numbers, target, sum - numbers[index]);
    }
}