import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] nums = new int[num];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < num; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(nums);

        int target = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        br.close();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < target; i++) {
            int targetNum = Integer.parseInt(st.nextToken());
            int leftIdx = 0;
            int rightIdx = num - 1;

            while(leftIdx <= rightIdx) {
                int midIdx = (leftIdx + rightIdx) / 2;
                if(targetNum == nums[midIdx]) {
                    sb.append("1\n");
                    break;
                } else if(targetNum < nums[midIdx]) {
                    rightIdx = midIdx - 1;
                } else if(targetNum > nums[midIdx]) {
                    leftIdx = midIdx + 1;
                }
                if(leftIdx > rightIdx) {
                    sb.append("0\n");
                    break;
                }
            }
        }
        System.out.println(sb.toString());

    }
}
