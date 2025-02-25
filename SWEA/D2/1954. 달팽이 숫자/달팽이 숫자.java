import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int testcase = Integer.parseInt(br.readLine());

        for (int tc = 0; tc < testcase; tc++) {
            int snailSize = Integer.parseInt(br.readLine());
            int[][] snailMatrix = new int[snailSize][snailSize];
            snailMatrix[0][0] = 1;
            int row = 0;
            int col = 0;

            for (int i = 2; i <= snailSize * snailSize; i++) {

                if (col + 1 < snailSize && snailMatrix[row][col + 1] == 0) {
                    while (col + 1 < snailSize && snailMatrix[row][col + 1] == 0) {
                        snailMatrix[row][++col] = i++;
                    }
                } else if (row + 1 < snailSize && snailMatrix[row + 1][col] == 0) {
                    while (row + 1 < snailSize && snailMatrix[row + 1][col] == 0) {
                        snailMatrix[++row][col] = i++;
                    }
                } else if (col - 1 >= 0 && snailMatrix[row][col - 1] == 0) {
                    while (col - 1 >= 0 && snailMatrix[row][col - 1] == 0) {
                        snailMatrix[row][--col] = i++;
                    }
                } else {
                    while (row - 1 >= 0 && snailMatrix[row - 1][col] == 0) {
                        snailMatrix[--row][col] = i++;
                    }
                }

                i--;
            }

            sb.append("#").append(tc + 1).append("\n");
            for (int i = 0; i < snailMatrix.length; i++) {
                for (int j = 0; j < snailMatrix[i].length; j++) {
                    sb.append(snailMatrix[i][j]).append(" ");
                }
                sb.append("\n");
            }
        }

        System.out.println(sb);
        br.close();
    }
}