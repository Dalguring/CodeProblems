import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(pac(N));
        
    }
    public static int pac(int a) {
		if(a == 0) return 1;
		return a *= pac(a-1);
	}
}