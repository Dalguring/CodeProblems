import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	        int total = 0;
			while(true) {
	            int a = sc.nextInt();
	            int b = sc.nextInt();
	            if(a == 0 && b == 0) {
	                break;
	            }
	            total = a+b;
	            System.out.println(total);
	        }
    }
}