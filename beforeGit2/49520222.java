import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String Jaah = sc.next();
		String Daah = sc.next();
		int maxJ = Jaah.length()-1;
		int maxD = Daah.length()-1;
		
		if(maxD <= maxJ) {
			System.out.println("go");
		} else {
			System.out.println("no");
		}
	}
	
}

