import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[] arr = new String[N];
		int isO = 0;
		int total = 0;
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.next();
			String[] array = arr[i].split("");
			for(String j : array) {
				if(j.equals("O")) {
					isO++;
					total += isO;
				} else if(j.equals("X")){
					isO=0;
				}
			}
			System.out.println(total);
			total = 0;
			isO=0;
		}
	}

}