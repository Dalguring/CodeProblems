import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int targetYear = Integer.parseInt(br.readLine());
        int rtn = 0;
        br.close();
        
        if (targetYear % 4 == 0 && targetYear % 100 != 0)
            rtn = 1;
        if (targetYear % 400 == 0)
            rtn = 1;

        System.out.println(rtn);
    }
}
