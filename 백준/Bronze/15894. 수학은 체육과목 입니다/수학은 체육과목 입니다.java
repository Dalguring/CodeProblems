import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long count = Long.parseLong(br.readLine());
        System.out.println(4 * count);
    }
}