import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        int[] nums = new int[6];

        for (int i = 0; i < nums.length; i++)
            nums[i] = Integer.parseInt(st.nextToken());

        int x = 0;
        int y = 0;

        OUTER:
        for (int i = -999; i < 1000; i++) {
            for (int j = -999; j < 1000; j++) {
                if (nums[0] * i + nums[1] * j == nums[2] && nums[3] * i + nums[4] * j == nums[5]) {
                    x = i;
                    y = j;
                    break OUTER;
                }
            }
        }
        System.out.println(x + " " + y);
    }
}