import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sever = Integer.parseInt(br.readLine());
        int pre = 2;

        if (sever == 1) {
            System.out.println(pre);
            return;
        }

        for (int i = 2; i <= sever; i++) {
            pre += i / 2 + 1;
        }

        System.out.println(pre);
        br.close();
    }
}
