class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        
        int bigBill = Math.max(bill[0], bill[1]);
        int smallBill = Math.min(bill[0], bill[1]);
        int bigWallet = Math.max(wallet[0], wallet[1]);
        int smallWallet = Math.min(wallet[0], wallet[1]);

        while (bigBill > bigWallet || smallBill > smallWallet) {
            int temp = bigBill / 2;
            bigBill = Math.max(temp, smallBill);
            smallBill = Math.min(temp, smallBill);
            answer++;
        }
        
        return answer;
    }
}