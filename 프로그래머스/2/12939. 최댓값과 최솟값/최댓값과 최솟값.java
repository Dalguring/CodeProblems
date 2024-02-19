import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String[] strings = s.split(" ");
        int[] array = Arrays.stream(strings).mapToInt(Integer::parseInt).sorted().toArray();
        
        return array[0] + " " + array[array.length - 1];
    }
}