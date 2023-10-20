import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Node2 getNumber = null;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < 9; i++) {
            int number = Integer.parseInt(br.readLine());
            max = Math.max(number, max);
            if (number == max)
                getNumber = new Node2(number, i + 1);
        }

        br.close();
        System.out.println(getNumber.toString());
    }
}

class Node2 {
    int number;
    int index;

    public Node2(int number, int index) {
        this.number = number;
        this.index = index;
    }

    @Override
    public String toString() {
        return number + "\n" + index;
    }
}