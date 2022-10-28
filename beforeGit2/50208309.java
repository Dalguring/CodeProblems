import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		sc.close();
		
		int cnt = 0;
		int num = 0;
		
		while(true) {
			cnt++;
			num += cnt;
			if(X <= num) { break; }
		}
		
		int lNum = Math.abs(num - X)+1;
		int rNum = cnt - Math.abs(num - X);
		if(cnt % 2 == 1) {
			System.out.println(lNum + "/" + rNum); 
		} else {
			System.out.println(rNum + "/" + lNum);
		}
	}

}
