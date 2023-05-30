import java.io.*;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while(true) {
            int target = Integer.parseInt(br.readLine());
            if(target == -1) break;
            Set<Integer> set = new LinkedHashSet<Integer>();
            set.add(1);
            for(int i = 2; i <= target / 2; i++) {
                if(target % i == 0) set.add(i);
            }
            int total = 0;
            for(int i : set) {
                total += i;
            }
            if(total == target) {
                bw.write(print(set, target)+"\n");
            } else {
                bw.write(target + " is NOT perfect.\n");
            }
            bw.flush();
        }
        br.close();
        bw.close();
    }

    public static String print(Set<Integer> set, int target) {
        String str = target + " = ";
        for(int i : set) {
            str += i + " + ";
        }
        str = str.substring(0, str.length() - 3);

        return str;
    }
}
