import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        int[] alphabets = new int['Z' - 'A' + 1];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] chars = br.readLine().toUpperCase().toCharArray();

        for (int i = 0; i < chars.length; i++) {
            alphabets[chars[i] - 'A']++;
        }

        int max = -1;
        char c = '?';

        for (int i = 0; i < alphabets.length; i++) {
            if (alphabets[i] > max) {
                max = alphabets[i];
                c = (char) (i + 'A');
            } else if (alphabets[i] == max) {
                c = '?';
            }
        }

        System.out.print(c);
        br.close();
    }
}