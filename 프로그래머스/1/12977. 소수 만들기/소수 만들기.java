class Solution {
    private static int count = 0;
    public int solution(int[] nums) {
        
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    isPrime(nums[i] + nums[j] + nums[k]);
                }
            }
        }

        return count;
    }
    
    static void isPrime(int target) {
        boolean isPrime = true;

        for (int i = 2; i <= Math.sqrt(target); i++) {
            if (target % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            count++;
        }
    }
}