class Solution {
    public int solution(String my_string) {
        int plusNum = 0;
        for(String s : my_string.replaceAll("[a-zA-z]", " ").split(" ")) {
            plusNum += s.length() != 0 ?Integer.parseInt(s) : 0;
        }
        
        return plusNum;
    }
}