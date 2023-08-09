class Solution {
    public int solution(int chicken) {
        int serviceChickens = 0;
        int coupons = chicken;
        
        return getServiceChickens(serviceChickens, coupons);
    }
    
    static int getServiceChickens(int serviceChickens, int coupons) {
        if(coupons / 10 == 0)
            return serviceChickens;
        serviceChickens += coupons / 10;
        coupons = coupons / 10 + coupons % 10;

        return getServiceChickens(serviceChickens, coupons);
    }
}