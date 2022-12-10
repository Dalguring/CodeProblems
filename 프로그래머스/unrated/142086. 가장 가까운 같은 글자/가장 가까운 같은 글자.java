class Solution {
    public int[] solution(String s) {
        int cnt = 'z' - 'a' + 1;
        int[] sol = new int[s.length()];
        boolean[] isChecked = new boolean[cnt];
        
        for(int i = 0; i < s.length(); i++) {
            int target = s.charAt(i) - 97;
            if(isChecked[target] == false) {
                isChecked[target] = true;
                sol[i] = -1;
                continue;
            } else {
                sol[i] = i - s.substring(0,i).lastIndexOf(s.charAt(i));
            }
        }
        return sol;
    }
}