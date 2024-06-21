import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String alphabet = br.readLine().toUpperCase();
        StringBuilder sb = new StringBuilder();

        for (char c : alphabet.toCharArray()) {
            sb.append(c - 'A' + 1).append(" ");
        }

        System.out.println(sb);
    }
}
