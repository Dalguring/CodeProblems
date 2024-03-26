class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int attackIndex = 0;
        Bandage hero = new Bandage("성민", health);
        hero.setOptions(bandage);
        boolean isAlive = true;

        for (int i = 1; i <= attacks[attacks.length - 1][0]; i++) {
            System.out.println(i + "초");
            int attackedTime = attacks[attackIndex][0];
            int damage = attacks[attackIndex][1];

            if (attackedTime == i) {
                isAlive = hero.attacked(damage);
                if (!isAlive) {
                    System.out.println("======end======");
                    return -1;
                }
                attackIndex++;
            } else {
                hero.recovery();
            }
        }

        if (isAlive) {
            System.out.println("몬스터의 수차례의 공격속에서도 살아남았습니다 !!");
            System.out.println("남은 체력 : " + hero.health);
        }
        
        return hero.health;
    }
    
    private static final class Bandage {
        private String name;
        private int originalHealth;
        private int health;
        private int bandagingTime;
        private int recovery;
        private int additionalRecovery;
        private int time = 0;

        public Bandage(String name, int health) {
            this.name = name;
            this.originalHealth = health;
            this.health = health;

            System.out.println("새로운 캐릭터가 생성되었습니다 !\n캐릭터명 : " + this.name + "\n체력 : " + this.health + "\n=================");
        }

        public void setOptions(int[] options) {
            this.bandagingTime = options[0];
            this.recovery = options[1];
            this.additionalRecovery = options[2];

            System.out.println("캐릭터의 붕대감기가 설정되었습니다!\n붕대 시전시간 : " + bandagingTime
                    + "\n1초당 회복량 : " + recovery + "\n추가 회복량 : " + additionalRecovery + "\n=================");
        }

        public void clearTime() {
            this.time = 0;

            System.out.println("붕대 시전시간이 초기화 되었습니다ㅠㅠ\n=================");
        }

        public void getAdditionalRecovery() {
            if (this.originalHealth >= this.health + this.additionalRecovery) {
                this.health += this.additionalRecovery;
                System.out.println("붕대감기를 완료해 체력이 추가로 회복되었습니다 ! 현재체력 : " + health);
                clearTime();
            } else {
                this.health = this.originalHealth;
                System.out.println("최대 체력보다 회복량이 커 일부 체력만 회복되었습니다 ! 현재체력 : " + health);
                clearTime();
            }
        }

        public void recovery() {
            if (this.originalHealth >= this.health + this.recovery) {
                this.health += this.recovery;
                System.out.println("체력을 " + recovery + "만큼 회복했습니다 ! 현재체력 : " + health + "\n=================");
            } else {
                this.health = this.originalHealth;
                System.out.println("최대 체력보다 회복량이 커 체력을 회복하지 않습니다 ! 현재체력 : " + health + "\n=================");
            }

            this.time++;

            if (time == bandagingTime) {
                getAdditionalRecovery();
            }
        }

        public boolean attacked(int damage) {
            if (health <= damage) {
                System.out.println("캐릭터가 사망하였습니다...");
                return false;
            }

            health -= damage;
            System.out.println("캐릭터가 " + damage + "만큼 공격받았습니다 ! 남은 체력 : " + health + "\n=================");
            clearTime();

            return true;
        }
    }
}