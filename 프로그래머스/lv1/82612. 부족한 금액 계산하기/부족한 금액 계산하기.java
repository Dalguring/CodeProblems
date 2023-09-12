class Solution {
    public long solution(int price, int money, int count) {
        long sum = 0;
        sum = getPrice(price, count, sum);
        
        if (sum > money)
            return sum - money;
        else return 0;
    }
    
    static long getPrice(int price, int count, long sum) {
        sum = sum + price * count;
        count--;
        if (count == 0)
            return sum;

        return getPrice(price, count, sum);
    }
}