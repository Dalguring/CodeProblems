import java.util.Arrays;
import java.util.Collections;

class Solution
{
    public int solution(int []A, int []B)
    {
        Arrays.sort(A);
        Integer[] B2 = Arrays.stream(B).boxed().toArray(Integer[]::new);
        Arrays.sort(B2, Collections.reverseOrder());
        int sum = 0;

        for (int i = 0; i < A.length; i++) {
            sum += A[i] * B2[i];
        }
        
        return sum;
    }
}