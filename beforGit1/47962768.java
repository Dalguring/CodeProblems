import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int cycle = 1;
    	int Num = (N%10)*10 + (((N/10)+(N%10))%10);
    	while(true) {
    		Num = (Num%10)*10 + (((Num/10)+(Num%10))%10);
    		cycle++;
    		if(Num==0) {
	    		cycle=1;
	    		System.out.println(cycle);
	    		break;
    		} else if(N==Num) {
    			System.out.println(cycle);
    			break;
    		}
    	}
    	
    }
}