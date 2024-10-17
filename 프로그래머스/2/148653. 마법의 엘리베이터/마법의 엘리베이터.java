class Solution {
    public int solution(int storey) {
        int result = 0;

        while (storey != 0) {
            int target = storey % 10;

            if (target < 5) {
                storey -= target;
                result += target;
            } else if (target == 5) {
                if (storey / 10 % 10 >= 5) {
                    storey += target;
                } else {
                    storey -= target;
                }
                result += target;
            } else {
                storey += 10 - target;
                result += 10 - target;
            }

            storey /= 10;
        }
        
        return result;
    }
}