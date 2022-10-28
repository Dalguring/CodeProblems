import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		if(A > 0 && B > 0 && C > 0 ){
			int bep = 0;
			if(B >= C) {
				bep = -1;
				System.out.println(bep);
			} else {
				bep = (int)(A/(C-B))+1;
				System.out.println(bep);
			}
			
		}
		
	}
}