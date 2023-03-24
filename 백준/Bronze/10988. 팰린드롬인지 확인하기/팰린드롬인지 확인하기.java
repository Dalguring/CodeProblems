import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String oriStr = br.readLine();
		br.close();
		StringBuilder sb = new StringBuilder(oriStr);
		if(oriStr.equals(sb.reverse().toString())) System.out.println(1);
		else System.out.println(0);
	}

}
