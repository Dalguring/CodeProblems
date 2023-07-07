import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        Set<Integer> hashSet = new HashSet<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        while(st.hasMoreTokens())
            hashSet.add(Integer.parseInt(st.nextToken()));
        st = new StringTokenizer(br.readLine());
        br.close();
        while(st.hasMoreTokens()) {
            int target = Integer.parseInt(st.nextToken());
            if( hashSet.contains(target) ){
                hashSet.remove(target);
            } else {
                hashSet.add(target);
            }
        }

        System.out.println(hashSet.size());

    }
}

