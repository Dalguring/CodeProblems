class Solution {
    public int solution(int[] common) {
        int eqD = common[1] - common[0];
        
        return isEqd(eqD, common);
    }
    
    static int isEqd (int eqD, int[] common) {
        for(int i = 0; i < common.length - 1; i++) 
            if(common[i + 1] - common[i] != eqD) return common[common.length - 1] * (common[1] / common[0]);
        
        return common[common.length - 1] + eqD;
    }
}