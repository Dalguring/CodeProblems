import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String input = st.nextToken();
        int baseNumber = Integer.parseInt(st.nextToken());
        int answer = 0;

        for (int i = 0; i < input.length(); i++) {
            answer += Character.isDigit(input.charAt(i)) ?
                    Math.pow(baseNumber, input.length() - 1 - i) * Character.getNumericValue(input.charAt(i))
                    : Math.pow(baseNumber, input.length() - 1 - i) * (input.charAt(i) - 'A' + 10);
        }

        System.out.println(answer);
        br.close();
    }
}
