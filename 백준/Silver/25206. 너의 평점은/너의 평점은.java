import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double point = 0;
		double grade = 0;
		double sumPoint = 0;
		double mulPointGrade = 0;
		for(int i = 0; i < 20; i++) {
			String trg = br.readLine();
			point = Double.parseDouble(trg.split(" ")[1]);
			if(trg.split(" ")[2].equals("P")) continue;
			sumPoint += point;
			switch (trg.split(" ")[2]) {
			case "A+": grade = 4.5; break;
			case "A0": grade = 4.0; break;
			case "B+": grade = 3.5; break;
			case "B0": grade = 3.0; break;
			case "C+": grade = 2.5; break;
			case "C0": grade = 2.0; break;
			case "D+": grade = 1.5; break;
			case "D0": grade = 1.0; break;
			case "F" : grade = 0.0; break;
			}
			mulPointGrade += point * grade;
		}
        br.close();
		System.out.println(mulPointGrade / sumPoint);
	}

}
