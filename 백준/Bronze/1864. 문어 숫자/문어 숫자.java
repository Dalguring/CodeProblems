import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<Character, Integer> octopusSign = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        octopusSign.put('-', 0);
        octopusSign.put('\\', 1);
        octopusSign.put('(', 2);
        octopusSign.put('@', 3);
        octopusSign.put('?', 4);
        octopusSign.put('>', 5);
        octopusSign.put('&', 6);
        octopusSign.put('%', 7);
        octopusSign.put('/', -1);

        String sign;

        while (!(sign = br.readLine()).equals("#")) {
            int exponent = sign.length() - 1;
            int length = 0;
            long sum = 0L;

            while (length < sign.length()) {
                sum += octopusSign.get(sign.charAt(length)) * Math.pow(8, exponent);
                length++;
                exponent--;
            }

            sb.append(sum).append("\n");
        }

        System.out.println(sb);
    }
}
