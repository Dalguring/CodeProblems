import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        br.close();
        long answer = 1;
        if(num == 0) {
            System.out.println(1);
            return;
        }
        System.out.println(factorial(num, answer));
    }

    static long factorial(int num, long answer) {
        answer *= num;
        num -= 1;
        if(num <= 1) return answer;
        return factorial(num, answer);
    }
}

