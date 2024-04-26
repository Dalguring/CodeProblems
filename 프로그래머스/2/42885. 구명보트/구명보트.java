import java.util.Arrays;

class Solution {
    public int solution(int[] people, int limit) {
        Arrays.sort(people);
        int left = 0;
        int right = people.length - 1;
        int boat = 0;

        while (left < right) {
            if (people[right] + people[left] <= limit) {
                left++;
                right--;
                boat++;
            } else {
                right--;
            }
        }
        
        return people.length - boat;
    }
}