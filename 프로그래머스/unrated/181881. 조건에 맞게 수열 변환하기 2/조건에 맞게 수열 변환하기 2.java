import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int rtInt = 0;
        int[] beforeArr = Arrays.copyOf(arr, arr.length);
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < 50 && arr[i] % 2 == 1) arr[i] = arr[i] * 2 + 1;
            else if(arr[i] >= 50 && arr[i] % 2 == 0) arr[i] /= 2;
        }
        if(Arrays.toString(arr).equals(Arrays.toString(beforeArr))) return rtInt;

        return returnInt(arr, beforeArr, rtInt);
    }
    
    static int returnInt(int[] arr, int[] beforeArr, int rtInt) {
        for (int i = 0; i < arr.length; i++) {
            beforeArr[i] = arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < 50 && arr[i] % 2 == 1) arr[i] = arr[i] * 2 + 1;
            else if(arr[i] >= 50 && arr[i] % 2 == 0) arr[i] /= 2;
        }
        
        rtInt++;
        
        if(Arrays.toString(arr).equals(Arrays.toString(beforeArr))) return rtInt;

        return returnInt(arr, beforeArr, rtInt);
    }
}