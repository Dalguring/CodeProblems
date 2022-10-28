import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int C = sc.nextInt();
		double[][] arr = new double [C][];
		for(int i = 0; i < arr.length; i++) {
			int N = sc.nextInt();
			arr[i] = new double[N];
			double a = 0;
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
				a += arr[i][j];
			}
			a /= N;
			double count = 0;
			double perc = 0;
			for(int j = 0; j < arr[i].length; j++) {
				if(arr[i][j] > a) {
					count++;
				}
			}
			perc = (count / N)*100;
			String sPerc = String.format("%.3f", perc);
			System.out.println(sPerc+"%");
		}
	
	}

}