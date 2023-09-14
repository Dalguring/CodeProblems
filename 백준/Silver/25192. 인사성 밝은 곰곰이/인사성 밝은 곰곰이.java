import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>();
        int count = 0;

        for (int i = 0; i < N; i++) {
            String target = br.readLine();
            if (target.equals("ENTER")) {
                set.clear();
                continue;
            }
            if (set.add(target))
                count++;
        }
        br.close();
        System.out.println(count);

    }
}