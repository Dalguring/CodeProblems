import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int money = 0;
		if(a==b && b==c) {
			money = a==b && b==c ? 10000+a*1000 : 0;
		} else if(a==b && b!=c) {
			money = a==b && b!=c ? 1000+a*100 	: 0;
		} else if(a==c && a!=b) {
			money = a==c && a!=b ? 1000+a*100 	: 0;
		} else if(b==c && b!=a) {
			money = b==c && b!=a ? 1000+b*100 	: 0;
		} else if(a!=b && b!=c) {
			int max   = a > b ? a : b;
			money = max > c ? max*100 : c*100;
		}
		System.out.println(money);
	}

}
