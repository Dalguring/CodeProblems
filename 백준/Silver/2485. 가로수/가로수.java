import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Set<Integer> treeSet = new TreeSet<>();
        int[] arrays = new int[N];

        for (int i = 0; i < N; i++)
            arrays[i] = Integer.parseInt(br.readLine());
        br.close();

        for (int i = 1; i < N; i++)
            treeSet.add(arrays[i] - arrays[i - 1]);

        Iterator<Integer> iterator = treeSet.iterator();
        int gcdNum = iterator.next();

        while (iterator.hasNext()) {
            gcdNum = gcd(iterator.next(), gcdNum);
            if (gcdNum == 1)
                break;
        }

        System.out.println((arrays[arrays.length - 1] - arrays[0]) / gcdNum + 1 - arrays.length);
    }

    static int gcd(int a, int b) {
        if (a % b == 0)
            return b;
        return gcd(b, a % b);
    }
}