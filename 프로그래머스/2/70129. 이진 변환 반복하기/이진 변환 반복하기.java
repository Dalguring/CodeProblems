import java.util.stream.Stream;

class Solution {
    private static int zeros;
    private static int count;
    
    public int[] solution(String s) {
        getBinary(s);
        
        return new int[]{count, zeros};
    }
    
    static void getBinary(String s) {
        if (s.equals("1")) {
            return;
        }

        count++;
        zeros += (int) Stream.of(s.split(""))
                .filter(elem -> elem.equals("0"))
                .count();

        int length = s.replaceAll("0", "").length();
        s = Integer.toBinaryString(length);
        getBinary(s);
    }
}