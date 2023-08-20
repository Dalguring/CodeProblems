import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        boolean[] isExists = new boolean[10];
        Arrays.sort(numbers);
        
        for (int i = 0; i < numbers.length; i++)
            isExists[numbers[i]] = true;

        int answer = 0;
        for (int i = 0; i < isExists.length; i++) {
            if(!isExists[i])
                answer += i;
        }
        
        return answer;
    }
}