import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	double[]arr = new double[N];
    	double M = 0;
    	double total = 0;
    	for(int i=0; i < arr.length; i++) {
    		arr[i] = sc.nextInt();
    		M = M > arr[i] ? M : arr[i];
    	}
    	for(int i=0; i<arr.length; i++) {
    		arr[i] = arr[i]/M*100;
    		total = total+arr[i];
    	}
    	System.out.println(total/N);
    }
}