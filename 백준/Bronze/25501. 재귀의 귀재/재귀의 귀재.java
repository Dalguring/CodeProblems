import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			String s = br.readLine();
			int[] result = new int[2];
			result = isPalindrome(s);
			System.out.println(result[0] + " " + result[1]); 
			cnt = 0;
		}
		
		br.close();
	}
	
	public static int[] isPalindrome(String s) {
		return recursion(s, 0, s.length()-1);
	}
	
	static int cnt = 0;
	public static int[] recursion(String s, int l, int r) {
		cnt++;
		
		if(l >= r) return new int[] {1, cnt};
		else if(s.charAt(l) != s.charAt(r)) return new int[] {0, cnt};
		else return recursion(s, l+1, r-1);
		
	}

}
