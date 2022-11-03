import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int gradeNum = Integer.parseInt(br.readLine());
		br.close();
		if(checkNum(gradeNum)) {
			bw.write(grade(gradeNum)+"\n");
			bw.flush();
		} else {
			bw.write("F\n");
			bw.flush();
		}
		bw.close();
	}
	
	public static String grade(int gradeNum) {
		String grade;
		if(gradeNum == 100) grade = "A";
		else {
			switch (gradeNum / 10) {
			case 9: grade = "A"; break;
			case 8: grade = "B"; break;
			case 7: grade = "C"; break;
			case 6: grade = "D"; break;
			default: grade = "F"; break;
			}
		}
		return grade;
	}
	
	// 입력받은 성적 유효성 검사
	public static boolean checkNum(int gradeNum) {
		boolean checkNum = false;
		if(gradeNum >= 0 && gradeNum <= 100) checkNum = true;
		return checkNum;
	}
}
