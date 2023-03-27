import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
        br.close();
		int cycle = N;
		for(int i = 0; i < N - 1; i++) {
			for(int j = cycle - 1; j > 0; j--) System.out.print(" ");
			for(int j = 0; j < 2*i + 1; j++) System.out.print("*");
			cycle--;
			System.out.println();
		}
		for(int i = 0; i < N*2 - 1; i++) System.out.print("*");
		System.out.println();
		for(int i = N-1; i > 0; i--) {
			cycle++;
			for(int j = cycle - 1; j > 0; j--) System.out.print(" ");
			for(int j = 0; j < 2*i-1; j++) System.out.print("*");
			if(i != 1) System.out.println();
		}
	}

}
