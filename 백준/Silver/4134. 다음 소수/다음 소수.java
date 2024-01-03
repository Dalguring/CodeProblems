import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < testCase; i++) {
            long target = Long.parseLong(br.readLine());
            sb.append(getDecimal(target)).append("\n");
        }

        System.out.println(sb);
        br.close();
    }

    static long getDecimal(long target) {
        boolean isDecimal = false;
        if (target == 0 || target == 1 || target == 2)
            return 2;
        if (target == 3)
            return 3;

        while(true) {
            for (int i = 2; i <= Math.sqrt(target); i++) {
                if (target % i == 0) {
                    isDecimal = false;
                    break;
                }
                isDecimal = true;
            }
            if (isDecimal)
                break;
            target++;
        }

        return target;
    }
}
