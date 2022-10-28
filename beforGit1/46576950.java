import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
		    int score = sc.nextInt();
		    String score2 = score <=100 && score >= 90 ?    "A"  : 
		                 score <=89 && score >= 80 ?     	"B"  :
		                 score <=79 && score >= 70 ?     	"C"  :
		                 score <=69 && score >= 60 ?     	"D"  : "F";
		    System.out.println(score2);
		
    }
}