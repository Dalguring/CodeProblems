import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        br.close();
        Set<String> hashSet = new HashSet<>();
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j <= s.length() - i; j++) {
                hashSet.add(s.substring(j, j + i));
            }
        }
        System.out.println(hashSet.size());

    }
}

