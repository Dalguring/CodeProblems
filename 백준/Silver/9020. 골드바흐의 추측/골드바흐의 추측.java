import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			int n = Integer.parseInt(br.readLine());
			List<Integer> list = primes(n);
			System.out.println(print(list, n)); 
		}
	}
	
	public static ArrayList<Integer> primes(int n) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 2; i < n; i++) {
			if(getPrime(i)) {
				list.add(i);
			}
		}
		return list;
	}
	// 소수 구하는 메서드
	public static boolean getPrime(int n) {
		boolean isPrime = false;
		for(int i = 2; i <= Math.sqrt(n); i++) {
			if(n % i == 0) {
				return false;
			}
		}
		isPrime = true;
		return isPrime;
	}
	
	public static String print(List<Integer> list, int n) {
		int num = 0;
		int num2 = 0;
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i) * 2 == n) {
				num = list.get(i);
				num2 = list.get(i);
				return num + " " + num2;
			}
			for(int j = i; j < list.size(); j++) {
				if(list.get(i) + list.get(j) == n) {
					num = Math.min(list.get(i), list.get(j));
					num2 = Math.max(list.get(i), list.get(j));
				}
			}
		}
		
		return num + " " + num2;
	}
	
}
