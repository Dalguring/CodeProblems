import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        br.close();
        long answer = 0;
        for(int i = 2; i <= n; i++)
            answer += (n - i + 1);
        System.out.println(answer);
        System.out.println(2);
    }
}
