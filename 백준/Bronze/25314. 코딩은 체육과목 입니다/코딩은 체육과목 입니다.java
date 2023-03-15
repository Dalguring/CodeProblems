import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String repeat = "long";
		String end = "int";
		String result = "";
		int target = Integer.parseInt(br.readLine()) / 4;
		br.close();
		
		for(int i = 0; i < target; i++) {
			result += repeat + " ";
		}
		result += end;
		System.out.println(result);
	}

}
