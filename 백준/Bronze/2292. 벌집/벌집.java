import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int start = 1;
    	int end = 1;
    	int cycle = 1;
    	for(int i = start; i <= end; i++) {
    		if(N >= start && N <=end ) {
    			System.out.println(cycle);
    		}
    		start = end+1;
    		end = end+(6*cycle);
    		cycle++;
    	}
    }
}