import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        int money = 0;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = 0; i < testCase; i++) {
            money = Integer.parseInt(br.readLine());
            bw.append(money / 25 + " ");
            money = money % 25;
            bw.append(money / 10 + " ");
            money = money % 10;
            bw.append(money / 5 + " ");
            money = money % 5;
            bw.append(money+ "");
            bw.flush();
            System.out.println();
        }
        br.close();
        bw.close();
    }
}
