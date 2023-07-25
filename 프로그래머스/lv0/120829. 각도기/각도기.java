class Solution {
    public int solution(int angle) {
        if(angle == 90) return 2;
        
        switch(angle / 10) {
            case 0:case 1:case 2: case 3: case 4: case 5: case 6: case 7: case 8: return 1;
            case 9: case 10: case 11: case 12: case 13: case 14: case 15: case 16: case 17: return 3;
            case 18: return 4;
            default: return 0;
        }
        
    }
}