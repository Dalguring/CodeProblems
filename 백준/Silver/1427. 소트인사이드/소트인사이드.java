import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String result = br.readLine();
		
		br.close();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		char ch = '0';
		
		for(int i = 0; i < result.length(); i++) {
			arr.add(result.charAt(i)-ch);
		}
		
		Collections.sort(arr, Comparator.reverseOrder());
		
		for(int i = 0; i < arr.size(); i++) {
			System.out.print(arr.get(i));
		}
		
	}

}
