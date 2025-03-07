import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int testcase = Integer.parseInt(br.readLine());

        for (int tc = 0; tc < testcase; tc++) {
            int matrixSize = Integer.parseInt(br.readLine());
            int[] matrix = new int[matrixSize];
            int count = 0;

            st = new StringTokenizer(br.readLine());

            for (int i = 0; i < matrixSize - 1; i++) {
                br.readLine();
            }

            for (int j = 0; j < matrixSize; j++) {
                matrix[j] = Integer.parseInt(st.nextToken());
            }

            for (int j = matrixSize - 1; j > 0; j--) {
                if (matrix[j] != j + 1) {
                    count += count % 2 == 0 ? 1 : 0;
                } else {
                    count += count % 2 == 0 ? 0 : 1;
                }
            }

            sb.append(count).append("\n");
        }

        System.out.println(sb);
        br.close();
    }
}