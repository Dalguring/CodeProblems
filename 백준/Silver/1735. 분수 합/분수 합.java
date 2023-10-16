import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int firstNumerator = Integer.parseInt(st.nextToken());
        int firstDenominator = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        br.close();
        int secondNumerator = Integer.parseInt(st.nextToken());
        int secondDenominator = Integer.parseInt(st.nextToken());

        int gcd = gcd(firstDenominator, secondDenominator);
        int lcm = firstDenominator * secondDenominator / gcd;
        int numerator = firstNumerator * (lcm / firstDenominator) + secondNumerator * (lcm / secondDenominator);

        int gcd2 = gcd(lcm, numerator);
        System.out.println(numerator / gcd2 + " " + lcm / gcd2);
    }

    static int gcd(int firstDenominator, int secondDenominator) {
        int first = Math.max(firstDenominator, secondDenominator);
        int second = Math.min(firstDenominator, secondDenominator);

        if (first % second == 0)
            return second;

        return gcd(second, first % second);
    }
}