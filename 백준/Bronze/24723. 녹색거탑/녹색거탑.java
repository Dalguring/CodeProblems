import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int layer = sc.nextInt();
        sc.close();
        System.out.println((int)Math.pow(2, layer));
    }
}