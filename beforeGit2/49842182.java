import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 개수 N 입력받기
		int N = Integer.parseInt(br.readLine());
		ArrayList<Integer> arr = new ArrayList<>();
		// N크기의 배열 생성 후 값 입력받기
		for(int i = 0; i < N; i++) {
			arr.add(Integer.parseInt(br.readLine()));
		}
		
		Collections.sort(arr);
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < N; i++) {
			sb.append(arr.get(i)+"\n");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		
	}

}
