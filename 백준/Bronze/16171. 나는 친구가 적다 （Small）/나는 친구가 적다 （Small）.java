import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String string = br.readLine().replaceAll("[0-9]", "");
        String keyword = br.readLine();

        if (string.contains(keyword)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

        br.close();
    }
}
