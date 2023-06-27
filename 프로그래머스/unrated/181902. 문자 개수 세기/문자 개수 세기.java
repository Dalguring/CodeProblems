class Solution {
    public int[] solution(String my_string) {
        int[] result = new int[52];

        for(int i = 0; i < my_string.length(); i++) {
            if(my_string.charAt(i) <= 'Z') {
                result[my_string.charAt(i) - 'A'] += 1;
            } else {
                result[my_string.charAt(i) - 'A' - ('a' - 'Z' - 1)] += 1;
            }
        }
        
        return result;
    }
}