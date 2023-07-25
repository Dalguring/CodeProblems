class Solution {
    public int solution(int hp) {
        int ants = 0;
        
        return generalAnt(hp, ants);
    }
    
    private static int generalAnt(int hp, int ants) {
        if(hp % 5 == 0) {
            ants += hp / 5;
            return ants;
        }
        ants += hp / 5;
        hp %= 5;
        return soldier(hp, ants);
    }

    private static int soldier(int hp, int ants) {
        if(hp % 3 == 0) {
            ants += hp / 3;
            return ants;
        }
        ants += hp / 3;
        hp %= 3;
        return worker(hp, ants);
    }

    private static int worker(int hp, int ants) {
        ants += hp;
        return ants;
    }
}