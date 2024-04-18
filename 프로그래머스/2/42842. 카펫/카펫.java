class Solution {
    public int[] solution(int brown, int yellow) {
        int width = 0;
        int height = 0;
        int[] answer = new int[2];

        for (int i = 1; i <= Math.sqrt(yellow); i++) {
            if (yellow % i == 0) {
                height = i;
                width = yellow / height;

                if ((brown + yellow) % (width + 2) == 0) {
                    answer[0] = width + 2;
                    answer[1] = (brown + yellow) / (width + 2);
                }
            }
        }
        
        return answer;
    }
}