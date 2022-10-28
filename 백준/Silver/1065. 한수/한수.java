import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int index = 0;
		int bigIndex = 99;
		int N = sc.nextInt();
		for(int i=1; i <= N; i++) {
			if(i < 100) {index = i;}
			else {
				if((i/100) - ((i/10)%10) == ((i/10)%10) - (i%10)) {bigIndex++;}
			}
		}
		
		if(N < 100) {System.out.println(index);}
		else {System.out.println(bigIndex);}
		
	}

}
