class Solution {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < food.length; i++) {
            for (int j = 0; j < food[i] / 2; j++) {
                sb.append(i);
            }
        }
        StringBuilder temp = new StringBuilder(sb.toString());
        temp.reverse();
        sb.append(0);
        sb.append(temp);
        
        return sb.toString();
    }
}