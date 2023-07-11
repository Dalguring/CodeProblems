class Solution {
    public int solution(int a, int b) {
        
        return rollingDice(a, b);
    }
    
    static int rollingDice(int a, int b) {
        int sum = 0;
        switch(a % 2 + b % 2) {
            case 0: sum = Math.abs(a - b); return sum;
            case 1: sum = 2 * (a + b); return sum;
            case 2: sum = (int)Math.pow(a, 2) + (int)Math.pow(b, 2); return sum;
        }

        return sum;
    }
}