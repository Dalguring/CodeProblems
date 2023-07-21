import java.util.*;

class Solution {
    public int solution(int n) {
        int pizzas = 1;
        
        return getPizzaSet(n, pizzas);
    }
    
    static int getPizzaSet(int n, int pizzas) {
        while(pizzas * 6 < n) {
            pizzas++;
            if(pizzas * 6 >= n) break;
        }
        if(pizzas * 6 % n == 0)
            return pizzas;

        pizzas++;

        return getPizzaSet(n, pizzas);
    }
}