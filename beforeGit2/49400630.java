import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int a = sc.nextInt(), b = sc.nextInt();
			if(a > b) { System.out.println("Yes");}
			else if(a == 0 && b == 0) { break; }
			else if(a <= b) { System.out.println("No");}
		}
	}

}
