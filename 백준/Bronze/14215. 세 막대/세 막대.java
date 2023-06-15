import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        int[] triangleLength = new int[3];
        for (int i = 0; i < triangleLength.length; i++) {
            triangleLength[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(triangleLength);
        int sumOfOther = triangleLength[0] + triangleLength[1];
        int maxLength = triangleLength[2];
        if(maxLength >= sumOfOther) {
            maxLength = sumOfOther -1;
            System.out.println(sumOfOther + maxLength);
        } else {
            System.out.println(triangleLength[0] + triangleLength[1] + triangleLength[2]);
        }
    }
}
