class Solution {
    public int solution(String[] strArr) {
        int[] ints = new int[31];
        for(String s : strArr)
            ints[s.length()]++;

        int max = Integer.MIN_VALUE;
        for(int i : ints)
            max = Math.max(i, max);
        
        return max;
    }
}