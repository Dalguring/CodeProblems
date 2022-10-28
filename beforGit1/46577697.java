import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a % 100 == 0 && a % 400 !=0) {
            a = 0;
        } else if(a % 4 == 0 || a % 400 == 0) {
            a = 1;
        } else {
            a = 0;
        }
        System.out.println(a);
    }
}