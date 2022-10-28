import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		for(char ch = 'a'; ch <= 'z'; ch+=1) {
			boolean find = false;
			for(int i = 0; i < S.length(); i++) {
				if(ch == S.charAt(i)) {
					find = true;
					System.out.print(i + " ");
					break;
				}
			}
			if(!find) {
				System.out.print(-1 + " ");
			}
		}
		
		
		
	}

}
