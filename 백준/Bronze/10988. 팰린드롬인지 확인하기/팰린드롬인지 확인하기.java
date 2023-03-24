import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] charSet = br.readLine().toCharArray();
		br.close();
		String oriStr = String.valueOf(charSet);
		StringBuilder sb = new StringBuilder();
		for(int i = charSet.length-1; i >= 0; i--) sb.append(charSet[i]);
		if(oriStr.equals(sb.toString())) System.out.println(1);
		else System.out.println(0);
	}

}
