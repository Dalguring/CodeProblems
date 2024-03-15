class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int originHp = health;
        int endTime = attacks[attacks.length - 1][0];
        int continualSuccess = 0;
        int attackCtr = 0;

        for (int i = 1; i <= endTime; i++) {
            // 공격 당한 경우
            if (attacks[attackCtr][0] == i) {
                continualSuccess = 0;
                health -= attacks[attackCtr][1];
                attackCtr++;
                if (health <= 0) {
                    health = -1;
                    break;
                }
            } else {
                // 피가 최대인 경우
                if (health != originHp) {
                    health = Math.min(health + bandage[1], originHp);
                }
                continualSuccess++;
                // 연속 성공한 경우
                if (continualSuccess == bandage[0]) {
                    health = Math.min(health + bandage[2], originHp);
                    continualSuccess = 0;
                }
            }
        }
        
        return health;
    }
}