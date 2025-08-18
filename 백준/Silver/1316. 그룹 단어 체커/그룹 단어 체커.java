import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcase = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 0; i < testcase; i++) {
            visited = new boolean['z' - 'a' + 1];
            char[] chars = br.readLine().toCharArray();
            count += isGroupWord(chars) ? 1 : 0;
        }

        System.out.print(count);
        br.close();
    }

    static boolean isGroupWord(char[] chars) {
        visited[(char) (chars[0] - 'a')] = true;

        for (int i = 1; i < chars.length; i++) {
            if (chars[i] != chars[i - 1]) {
                if (visited[(char) (chars[i] - 'a')]) {
                    return false;
                }
                visited[(char) (chars[i] - 'a')] = true;
            }
        }

        return true;
    }
}