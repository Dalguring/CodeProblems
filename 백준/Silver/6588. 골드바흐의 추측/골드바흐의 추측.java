import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] isComposite = new boolean[1000001];
        StringBuilder sb = new StringBuilder();
        String input;

        isComposite[0] = true;
        isComposite[1] = true;

        for (int i = 2; i < Math.sqrt(isComposite.length); i++) {
            if (!isComposite[i]) {
                for (int j = i * i; j < isComposite.length; j += i) {
                    isComposite[j] = true;
                }
            }
        }

        while (!(input = br.readLine()).equals("0")) {
            int target = Integer.parseInt(input);
            boolean found = false;

            for (int i = 3; i <= target / 2; i++) {
                if (!isComposite[i] && !isComposite[target - i]) {
                    sb.append(target).append(" = ").append(i).append(" + ").append(target - i).append("\n");
                    found = true;
                    break;
                }
            }

            if (!found) {
                sb.append("Goldbach's conjecture is wrong.\n");
            }
        }

        System.out.print(sb);
        br.close();
    }
}
