import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        
        List<Integer> answer = new ArrayList<>();
        for(int[] i : queries) {
            int[] tempArr = Arrays.copyOfRange(arr, i[0], i[1] + 1);
            Arrays.sort(tempArr);
            int num = 0;
            for(int j = 0; j < tempArr.length; j++) {
                if(tempArr[j] > i[2]) {
                    answer.add(tempArr[j]);
                    break;
                } else if(j == tempArr.length - 1 && tempArr[j] <= i[2]) {
                    answer.add(-1);
                }
            }
        }
        
        return answer.stream().mapToInt(x -> x).toArray();
    }
}