import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		char[] chArr = sc.nextLine().toCharArray();
		for(int i = 0; i < chArr.length; i++) {
			if(chArr[i] >= 65 && chArr[i]<=90) {
				chArr[i] += 32;
			} else if (chArr[i] >= 97 && chArr[i]<=122) {
				chArr[i] -= 32;
			}
		}
		for(char c : chArr) {
			System.out.print(c);
		}
				
	}

}
