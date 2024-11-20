import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] digits = new int[10];
        StringBuilder sb = new StringBuilder();

        BigInteger b1 = new BigInteger(br.readLine());
        BigInteger b2 = new BigInteger(br.readLine());
        BigInteger b3 = new BigInteger(br.readLine());

        String result = b1.multiply(b2).multiply(b3).toString();

        for (int i = 0; i < result.length(); i++) {
            digits[Character.getNumericValue(result.charAt(i))]++;
        }

        Arrays.stream(digits)
                .forEach(value -> sb.append(value).append("\n"));

        System.out.println(sb);
        br.close();
    }
}
