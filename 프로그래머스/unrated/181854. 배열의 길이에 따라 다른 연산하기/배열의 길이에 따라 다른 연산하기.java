class Solution {
    public int[] solution(int[] arr, int n) {
        int arrLengthIndex = arr.length % 2 == 0 ? 0 : 1;

        switch (arrLengthIndex) {
            case 0:
                for (int i = 1; i < arr.length; i += 2)
                    arr[i] += n;
                break;
            case 1:
                for (int i = 0; i < arr.length; i += 2)
                    arr[i] += n;
        }
        
        return arr;
    }
}