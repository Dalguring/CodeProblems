import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
//        int testcase = Integer.parseInt(br.readLine());

        for (int tc = 0; tc < 10; tc++) {
            int length = Integer.parseInt(br.readLine());
            char[][] charArray = new char[8][8];
            int count = 0;

            for (int i = 0; i < 8; i++) {
                String input = br.readLine();
                charArray[i] = input.toCharArray();
            }

            // 가로탐색
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8 - length + 1; j++) {
                    int pointer1 = j;
                    int pointer2 = j + length - 1;
                    boolean isPalindrome = true;

                    while (pointer1 <= pointer2) {
                        if (charArray[i][pointer1] != charArray[i][pointer2]) {
                            isPalindrome = false;
                            break;
                        }

                        pointer1++;
                        pointer2--;
                    }

                    count += isPalindrome ? 1 : 0;
                }
            }

            // 세로탐색
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8 - length + 1; j++) {
                    int pointer1 = j;
                    int pointer2 = j + length - 1;
                    boolean isPalindrome = true;

                    while (pointer1 <= pointer2) {
                        if (charArray[pointer1][i] != charArray[pointer2][i]) {
                            isPalindrome = false;
                            break;
                        }

                        pointer1++;
                        pointer2--;
                    }

                    count += isPalindrome ? 1 : 0;
                }
            }

            sb.append(String.format("#%d %d\n", tc + 1, count));
        }

        System.out.print(sb);
        br.close();
    }
}
