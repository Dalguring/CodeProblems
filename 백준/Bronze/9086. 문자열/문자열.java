import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i = 0; i < T; i++) {
			String str = sc.next();
			System.out.printf("%s%s",str.substring(0,1),str.substring(str.length()-1,str.length()));
			System.out.println();
		}
	}
}
