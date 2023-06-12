import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        String[] strArr = Arrays.deepToString(queries).replace("[", "").replace("]", "").replace(" ", "").split(",");
        int a = 0;
        int b = 0;
        for(int i = 0; i < strArr.length; i += 2) {
            a = arr[Integer.parseInt(strArr[i])];
            b = arr[Integer.parseInt(strArr[i+1])];
            arr[Integer.parseInt(strArr[i])] = b;
            arr[Integer.parseInt(strArr[i+1])] = a;
        }
        
        return arr;
    }
}