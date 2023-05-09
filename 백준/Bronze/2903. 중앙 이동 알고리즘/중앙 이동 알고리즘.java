import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        br.close();
        double side = 2;

        for(int i = 0; i < N; i++) {
            side = (side * 2) - 1;
        }
        int answer = (int)(Math.pow(side, 2));
        System.out.println(answer);
    }
}
