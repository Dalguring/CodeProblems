import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public long[] solution(long[] numbers) {

        List<Long> binaries = new ArrayList<>();

        for (long num : numbers) {
            String binary = Long.toBinaryString(num);

            if ((num & 1) == 0) {
                binaries.add(num + 1);
            } else {
                int index = binary.lastIndexOf("0");
                binaries.add(num ^ (3L << (binary.length() - index - 2)));
            }
        }

        long[] answer = binaries.stream()
                .mapToLong(Long::longValue)
                .toArray();
        
        return answer;
    }
}