import java.math.BigInteger;

class Solution {
    public int solution(String number) {
        
        return new BigInteger(number).remainder((BigInteger.valueOf(9))).intValue();
    }
}