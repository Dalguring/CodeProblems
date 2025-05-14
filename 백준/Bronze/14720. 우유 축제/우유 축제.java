import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        StringTokenizer st = new StringTokenizer(br.readLine());
        Milk younghak = new Milk();
        int count = 0;

        while (st.hasMoreTokens()) {
            int store = Integer.parseInt(st.nextToken());

            if (younghak.isToDrink(store)) {
                younghak.setNextDrink();
                count++;
            }
        }

        System.out.println(count);
        br.close();
    }
}

class Milk {
    private int toDrink = 0;

    public boolean isToDrink(int store) {
        return store == toDrink;
    }

    public void setNextDrink() {
        toDrink++;
        toDrink %= 3;
    }

    public String getToDrink() {
        return DrinkType.values()[toDrink].toString();
    }

    enum DrinkType {
        STRAWBERRY, CHOCOLATE, BANANA;

        @Override
        public String toString() {
            return name();
        }
    }
}