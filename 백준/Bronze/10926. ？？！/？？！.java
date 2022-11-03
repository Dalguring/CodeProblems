import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String id = br.readLine();
		br.close();
		bw.write(print(id)+"\n");
		bw.flush();
		bw.close();
	}
	
	public static String print(String id) {
		String newId = id + "??!";
		return newId;
	}
	
}
