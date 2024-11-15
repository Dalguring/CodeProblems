import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int judge = Integer.parseInt(br.readLine());
        char[] votes = br.readLine().toCharArray();
        int A = 0;

        for (char c : votes) {
            A += c == 'A' ? 1 : -1;
        }

        if (A < 0) {
            System.out.println("B");
        } else if (A > 0) {
            System.out.println("A");
        } else {
            System.out.println("Tie");
        }

        br.close();
    }
}
