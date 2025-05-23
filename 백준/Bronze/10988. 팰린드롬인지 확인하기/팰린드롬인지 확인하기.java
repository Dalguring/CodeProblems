import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int pointer1 = 0;
        int pointer2 = input.length() - 1;
        boolean isPalindrom = true;

        while (pointer1 <= pointer2) {
            if (input.charAt(pointer1) != input.charAt(pointer2)) {
                isPalindrom = false;
                break;
            }
            pointer1++;
            pointer2--;
        }

        System.out.println(isPalindrom ? 1 : 0);
        br.close();
    }
}
