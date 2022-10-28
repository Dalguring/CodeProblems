import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int cycle = 0;
    	int Num = N;
    	while(true) {
    		N = (N%10)*10 + (((N/10)+(N%10))%10);
            cycle++;
    		if(Num==N) {
	    		System.out.println(cycle);
	    		break;
            }
    	}
    	
    }
}