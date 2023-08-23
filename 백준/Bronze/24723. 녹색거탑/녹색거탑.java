import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int layer = Integer.parseInt(br.readLine());
        br.close();
        System.out.println((int) Math.pow(2, layer));
    }
}