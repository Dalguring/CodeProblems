import java.util.*;

public class Main{
	public static void main(String[] args){
		
        Scanner sc = new Scanner(System.in);
        char[] target = sc.nextLine().toCharArray();
        int total = 0;
        
        for(char c : target) {
            switch(c) {
                case 65: case 66: case 67: total += 3; break;  
                case 68: case 69: case 70: total += 4; break; 
                case 71: case 72: case 73: total += 5; break;
                case 74: case 75: case 76: total += 6; break;   
                case 77: case 78: case 79: total += 7; break;    
                case 80: case 81: case 82: case 83: total += 8; break;    
                case 84: case 85: case 86: total += 9; break;
                case 87: case 88: case 89: case 90: total += 10; break;    
            }
        }
        
        System.out.println(total);
                
	}
}