class Solution {
    public int solution(int[] date1, int[] date2) {
        StringBuilder sb = new StringBuilder();
        for(int a : date1)
            sb.append(a);
        sb.append(" ");
        for(int b : date2)
            sb.append(b);
        
        return Integer.valueOf(sb.toString().split(" ")[0])
             - Integer.valueOf(sb.toString().split(" ")[1]) >= 0 ? 0 : 1;
    }
}