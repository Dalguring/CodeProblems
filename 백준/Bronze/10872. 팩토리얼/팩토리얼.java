import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int target = Integer.parseInt(br.readLine());
        br.close();
        System.out.println(factorial(target));
    }

    static int factorial(int target) {
        if(target <= 1)
            return 1;
        return target * factorial(target - 1);
    }
}