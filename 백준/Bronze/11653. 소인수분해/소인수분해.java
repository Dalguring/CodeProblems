import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		if(n != 1) div(n);
	}
	
	public static void div(int n) {
		int num = 0;
		if(n == 1) return;
		
		for(int i = 2; i <= n; i++) {
			if(n % i == 0) {
				System.out.println(i);
				num = i;
				break;
			}
		}
		div(n / num);
	}
	

}
