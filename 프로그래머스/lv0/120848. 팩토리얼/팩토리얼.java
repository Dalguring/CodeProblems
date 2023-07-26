class Solution {
    public int solution(int n) {
        int max = Integer.MIN_VALUE;
        int target = 1;
        int factorialNum = 1;

        while(true) {
            int answer = factorial(target, factorialNum);
            if(answer > n)
                break;
            max = target;
            target++;
        }
        
        return max;
    }
    static int factorial(int target, int factorialNum) {
        if(target <= 1)
            return factorialNum;
        factorialNum *= target;
        target--;
        return factorial(target, factorialNum);
    }
}