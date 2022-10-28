import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int total = 0;
		for(int i = 0; i < 5; i++) {
			int A = Integer.parseInt(br.readLine()); 
			total += A;
		}
		
		System.out.println(total);
		
	}

}
