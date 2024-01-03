import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int windows = Integer.parseInt(br.readLine());

        System.out.println((int) Math.sqrt(windows));
        br.close();
    }

}
