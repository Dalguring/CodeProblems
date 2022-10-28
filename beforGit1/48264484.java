import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i = 0; i < T; i++) {
			int R = sc.nextInt();
			String P = "";
			String[] S = sc.next().split("");
			for(int j = 0; j < S.length; j++) {
				for(int x=0; x < R; x++) {
					P += S[j];
				}
			}
			System.out.println(P);
		}
		
	}
}