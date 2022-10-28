import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt();
		int t = 0;
		t += L / 5;
		if(L%5 == 0) {
			System.out.println(t);
		} else {
			System.out.println(t+1);
		}
		
		
	}

}
