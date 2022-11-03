import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int X = sc.nextInt();
		int N = sc.nextInt();
		int[] a = new int[N];
		int[] b = new int[N];
		int total = 0;
		for(int i=0; i < a.length; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			total += a[i]*b[i];
		}
		if(total == X) System.out.println("Yes");
		else		   System.out.println("No");
	}
}