import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] double_num_list = new int[num_list.length * 2];
        for (int i = 0; i < num_list.length; i++) {
            double_num_list[i] = num_list[i];
            double_num_list[i + num_list.length] = num_list[i];
        }
        
        return Arrays.copyOfRange(double_num_list, n, n + num_list.length);
    }
}