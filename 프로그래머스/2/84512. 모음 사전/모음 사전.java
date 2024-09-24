class Solution {
    public int solution(String word) {
        String vowels = "AEIOU";
        int[] weights = {781, 156, 31, 6, 1};
        int result = 0;

        for (int i = 0; i < word.length(); i++) {
            int index = vowels.indexOf(word.charAt(i));
            result += index * weights[i];
        }
        
        return result + word.length();
    }
}