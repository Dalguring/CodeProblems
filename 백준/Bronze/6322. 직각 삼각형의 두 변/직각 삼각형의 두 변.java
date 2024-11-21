import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        double answer = 0;
        int count = 1;

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int numA = Integer.parseInt(st.nextToken());
            int numB = Integer.parseInt(st.nextToken());
            int numC = Integer.parseInt(st.nextToken());

            if (numA == 0 && numB == 0 && numC == 0) {
                break;
            } else {
                if (numA == -1 && numB < numC) {
                    answer = Math.sqrt(Math.pow(numC, 2) - Math.pow(numB, 2));
                    sb.append("Triangle #").append(count).append("\n").append("a = ").append(String.format("%.3f", answer)).append("\n");
                } else if (numB == -1 && numA < numC) {
                    answer = Math.sqrt(Math.pow(numC, 2) - Math.pow(numA, 2));
                    sb.append("Triangle #").append(count).append("\n").append("b = ").append(String.format("%.3f", answer)).append("\n");
                } else if (numC == -1) {
                    answer = Math.sqrt(Math.pow(numB, 2) + Math.pow(numA, 2));
                    sb.append("Triangle #").append(count).append("\n").append("c = ").append(String.format("%.3f", answer)).append("\n");
                } else {
                    sb.append("Triangle #").append(count).append("\n").append("Impossible.").append("\n");
                }
            }
            sb.append("\n");
            count++;
        }
        
        System.out.println(sb);
    }
}