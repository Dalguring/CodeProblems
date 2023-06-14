import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < 3; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }
        br.close();
        Collections.sort(list);
        StringBuilder sb = new StringBuilder();
        int sum = list.get(0) + list.get(1) + list.get(2);
        if(sum != 180) {
            sb.append("Error");
        } else if(list.get(0) == 60 && list.get(1) == 60) {
            sb.append("Equilateral");
        } else if(list.get(0) == list.get(1) || list.get(1) == list.get(2)) {
            sb.append("Isosceles");
        } else {
            sb.append("Scalene");
        }

        System.out.println(sb.toString());
    }
}